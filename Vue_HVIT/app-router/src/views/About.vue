<template>
  <div class="about">
    <h1>about</h1>
    <h1>User id: {{id}} </h1>
  </div>
</template>
<script>
export default {
  data() {
    return {
      id:0,
    }
  },
  created() {
    this.id = this.$route.params.id
  },
}
</script>
