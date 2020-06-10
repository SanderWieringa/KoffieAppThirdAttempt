<template>
<div data-v-bf5d2bb8="" class="card-body">
    <form class="form-inline" @submit.prevent="createKoffieItem()">
        <div data-v-bf5d2bb8="" class="form-group">
            <label data-v-bf5d2bb8="">ID</label>
            <input data-v-bf5d2bb8="" type="text" required="required" class="form-control ml-sm-2 mr-sm-4 my-2">
        </div>
        <div data-v-bf5d2bb8="" class="form-group">
            <label data-v-bf5d2bb8="">Name</label>
            <input data-v-bf5d2bb8="" type="text" required="required" class="form-control ml-sm-2 mr-sm-4 my-2">
        </div>
        <div data-v-bf5d2bb8="" class="form-group">
            <label data-v-bf5d2bb8="">Price</label>
            <input data-v-bf5d2bb8="" type="text" required="required" class="form-control ml-sm-2 mr-sm-4 my-2">
        </div>
        <div data-v-bf5d2bb8="" class="ml-auto text-right">
            
            <input type="submit" value="Add" class="btn btn-primary my-2">
        </div>
    </form>
</div>
    
</template>
    
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
import { uuid } from 'vue-uuid';
    export default {
        name: "CardBody",
        data() {
            return {
                name: ''
            }
        },
        methods: {
            createKoffieItem() {
                const newKoffieItem = {
                    id: uuid.v4(),
                    name: this.name,
                    cost: this.cost
                }
                this.$emit('create-KoffieItem', newKoffieItem);

                this.id='';
                this.name='';
                this.cost='';
            }
        }
    }
</script>

<style scoped>
    
</style>

