<template lang="html">
<div class='app-header clearfix'>
	<div class="breadcrumb pull-left">
		<ul>
			<li v-for="(item, index) in breadcrumb" :class="['pull-left', {'active': index === breadcrumb.length - 1}]">
				<router-link :to="item.url">
					<i :class="['icon', item.icon]"></i>
					{{item.title}}
				</router-link>
				<i v-if="index !== breadcrumb.length - 1">/</i>
			</li>
		</ul>
	</div>
</div>
</template>

<script>
export default {
  name: "Header",
  props: {
    breadcrumb: {
      type: Array,
      default: () => []
    }
  }
};
</script>

