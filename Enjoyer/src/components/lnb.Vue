<template lang="html">
  <div class="lnb">
    <div class="logo">
    </div>
    <ul>
      <li v-for="(menuItem, index) in menus" :key="index" @click.stop="checkMenu(menuItem, false)" :class="{'active': menuItem.url === checkedMenu}">
        <router-link :to="menuItem.url">
          <i :class="['icon', menuItem.icon]"></i> {{menuItem.title}}
        </router-link>
        <ul v-if="menuItem.subMenu && menuItem.subMenu.length > 0">
          <li v-for="(subItem, subIndex) in menuItem.subMenu" :key="subIndex" @click.stop="checkMenu(subItem, true)" :class="{'active': subItem.url === checkedSubMenu}">
            <router-link :to="subItem.url">
              <i :class="['icon', subItem.icon]"></i> {{subItem.title}}
            </router-link>
          </li>
        </ul>
      </li>
    </ul>
  </div>
</template>

<script>
export default {
  name: "lnb",
  data() {
    return {
      checkedMenu: "",
      checkedSubMenu: "",
      menus: []
    };
  },
  mounted() {
    this.$api({
      method: "get",
      url: "/getMenu.do"
    })
      .then(response => {
        this.menus = response.data.menuList;
        this.menus.map(item => {
          if (item.url === this.$route.path) {
            this.checkedMenu = item.url;
          }

          if (
            item.subMenu &&
            item.subMenu.findIndex(
              subItem => subItem.url === this.$route.path
            ) > -1
          ) {
            this.checkedMenu = item.url;
            this.checkedSubMenu = this.$route.path;
          }
        });
      })
      .catch(function(error) {
        alert(error);
      });
  },
  methods: {
    checkMenu(menuItem, isSub) {
      if (isSub) {
        this.checkedSubMenu = menuItem.url;
      } else {
        this.checkedMenu = menuItem.url;
        if (menuItem.subMenu && menuItem.subMenu.length > 0) {
          this.checkedSubMenu = menuItem.subMenu[0].url;
        } else {
          this.checkedSubMenu = "";
        }
      }
    }
  }
};
</script>
