<template>
  <div class="container d-flex justify-center" style="margin-top: 30px; border: 1px solid blue">
    <div class="mx-auto" style="width: 600px, border:1px solid blue">
      <h2>Thong tin ca nhan</h2>
      <form action="">
        <div class="form-group">
          <label for="name">Name: </label>
          <input type="text" class="form-control" v-model="user.name" placeholder="VD:Nguyen Dinh Van" id="name" />
        </div>
        <div class="form-group">
          <label for="email">Email: </label>
          <input type="text" class="form-control" v-model="user.email" placeholder="VD:dinhvanmta04111994@gmail.com" id="email" />
        </div>
        <div>Gender:</div>
        <div class="form-check">
          <label class="form-check-lable" for=""> <input type="radio" v-model="user.gender" class="form-check-input" name="optradio" :value="true" /> Male </label>
        </div>
        <div class="form-group">
          <label for="age">Age: </label>
          <input type="number" v-model="user.age" class="form-control" placeholder="vd: 18" id="age" />
        </div>
        <div class="form-group">
          <label for="intro">Introduce myself: </label>
          <textarea name="intro" v-model="user.intro" class="form-control" id="intro" rows="5"> </textarea>
        </div>
        <v-btn type="button" @click="submit" class="btn btn-primary" outlined color="green">Submit</v-btn>
      </form>
      <div v-if="isSubmitted">
        <h3>Thong tin cua ban:</h3>

        <p>Name: {{ user.name }}</p>
        <p>Email: {{ user.email }}</p>
        <p>Gender: {{ user.gender ? "Male" : "Female" }}</p>
        <p>Age: {{ user.age }}</p>
        <p>Introduction: {{ user.intro }}</p>
      </div>
    </div>
  </div>
</template>
<script>
export default {
  data: () => ({
    user: {
      name: "",
      email: "",
      age: null,
      intro: "",
      gender: null,
    },
    isSubmitted: false,
  }),
  methods: {
    submit() {
      this.isSubmitted = true;
    },
  },
};
</script>
<style scoped></style>
<style lang=""></style>
