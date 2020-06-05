<template>
    <div class="category-item">
        {{category.title}},
        {{category.bedrag}}
        <button @click="$emit('del-category', category.id)" class="del">X</button>
    </div>
</template>

<script>
export default {
    name: "CategoryItem",
    props: ["category"]
}
</script>

<style scoped>
.category-item {
    background: #f4f4f4;
    padding: 10px;
    border-bottom: 1px #ccc dotted;
}

.del {
    background: #ff0000;
    color: #fff;
    border: none;
    padding: 0px 9px;
    border-radius: 50%;
    cursor: pointer;
    float: right;
}
</style>