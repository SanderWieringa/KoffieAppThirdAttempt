<template>
<div data-v-bf5d2bb8="" class="card-body">
    <form data-v-bf5d2bb8=""  class="form-inline">
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
            <button data-v-bf5d2bb8="" type="submit" class="btn btn-primary my-2">Add</button>
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
                this.$emit('createKoffieItem', newKoffieItem);

                this.id='';
                this.name='';
                this.cost='';
            }
        }
    }
</script>

<style scoped>
    
</style>

