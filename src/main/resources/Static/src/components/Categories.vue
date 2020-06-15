<template>
    <div>
        <div v-bind:key="category.id" v-for="category in categories">
            <categery-item v-bind:category="category" v-on:del-category="$emit('del-category', category.id)" />
        </div>
    </div>
</template>

<script>
import CategeryItem from './CategoryItem.vue';

export default {
    name: "Categories",
    components: {
        CategeryItem
    },
    props: ["categories"]
}
</script>

<style scoped>

</style>