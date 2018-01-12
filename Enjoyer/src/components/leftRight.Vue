<template lang="html">
<div class="layout-leftright">
	<div class="aside" style="'leftStyle'">
    <slot name="lnb"></slot>
  </div>
  <div class="layout-right"  style="'rightStyle'">
    <slot name="content"></slot>
  </div>
</div>
</template>

<script>
export default {
  name: "leftRight",
  props: {
    leftWidth: {
      type: String,
      default: '180px',
    },
    rightWidth: {
      type: String,
    }
  },
  data: function() {
    return{}
  },
  computed: {
    leftStyle() {
      var lw = this.leftWidth || "180px";
      return {
        left: 0,
			  width: lw
      }
    },
    rightStyle() {
      var rw = this.props.rightWidth;
      var rightStyle = {
        left: lw,
        right: 0
      }
      if (rw) {
        this.leftStyle = {
          left: 0,
          right: rw
        };
        rightStyle = {
          width: rw,
          right: 0
        }
      }
      return rightStyle;
    }
  }
};
</script>

