<template>
  <div class="container d-flex justify-center" style="background-color: grey">
    <v-card class="mx-auto" max-width="500">
      <v-container fluid>
        <v-row dense>
          <v-col v-for="card in cards" :key="card.title" :cols="card.flex">
            <v-card>
              <v-img :src="card.src" class="white--text align-end" gradient="to bottom, rgba(0,0,0,.1), rgba(0,0,0,.5)" height="200px">
                <v-card-title v-text="card.title" style="color: white !important; margin-left: -114px !important; margin-top: 114px !important"></v-card-title>
              </v-img>

              <v-card-actions>
                <v-spacer></v-spacer>

                <v-btn icon>
                  <v-icon>mdi-heart</v-icon>
                </v-btn>

                <v-btn icon>
                  <v-icon>mdi-bookmark</v-icon>
                </v-btn>

                <v-btn icon>
                  <v-icon>mdi-share-variant</v-icon>
                </v-btn>
              </v-card-actions>
            </v-card>
          </v-col>
        </v-row>
      </v-container>
    </v-card>
  </div>
</template>
<script>
export default {
  data: () => ({
    cards: [
      { title: "Pre-fab homes", src: "https://cdn.vuetifyjs.com/images/cards/house.jpg", flex: 12 },
      { title: "Favorite road trips", src: "https://cdn.vuetifyjs.com/images/cards/road.jpg", flex: 6 },
      { title: "Best airlines", src: "https://cdn.vuetifyjs.com/images/cards/plane.jpg", flex: 6 },
    ],
  }),
};
</script>

