<div data-v-bf5d2bb8="" class="card mt-5">
                <div data-v-bf5d2bb8="" class="card-header">
                    KoffieItem List
                </div>
                <div data-v-bf5d2bb8="" class="card-body">
                    <div data-v-bf5d2bb8="" class="table-responsive">
                        <table data-v-bf5d2bb8="" class="table">
                            <thead data-v-bf5d2bb8="">
                            <tr data-v-bf5d2bb8="">
                                <th data-v-bf5d2bb8="" scope="col">
                                    KoffieItem ID
                                </th>
                                <th data-v-bf5d2bb8="">
                                    KoffieItem Name
                                </th>
                                <th data-v-bf5d2bb8="">
                                    KoffieItem Cost
                                </th>
                                <th data-v-bf5d2bb8="">
                                    Action
                                </th>
                            </tr>
                            </thead>
                            <tbody data-v-bf5d2bb8="">
                            <tr v-for="koffieItem in koffieItems" :key="koffieItem.id">
                                <td>{{ koffieItem.id }}</td>
                                <td>{{ koffieItem.name }}</td>
                                <td>{{ koffieItem._cost }}</td>
                                <td data-v-bf5d2bb8="">
                                    <a data-v-bf5d2bb8="" href="#" class="icon">
                                        <i data-v-bf5d2bb8="" class="fa fa-trash">

                                        </i>
                                    </a>
                                    <a data-v-bf5d2bb8="" href="#" class="icon">
                                        <i data-v-bf5d2bb8="" class="fa fa-pencil">

                                        </i>
                                    </a>
                                    <a data-v-bf5d2bb8="" href="#/product/PhLZuMwkEXFko2FL10VA" class="icon">
                                        <i data-v-bf5d2bb8="" class="fa fa-eye">

                                        </i>
                                    </a>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>


<template>
<div data-v-bf5d2bb8="" class="card mt-5">
    <div data-v-bf5d2bb8="" class="card-header">
        KoffieItem List
    </div>
    <div data-v-bf5d2bb8="" class="card-body">
        <div data-v-bf5d2bb8="" class="table-responsive">
            <table data-v-bf5d2bb8="" class="table">
                <thead data-v-bf5d2bb8="">
                <tr data-v-bf5d2bb8="">
                    <th data-v-bf5d2bb8="" scope="col">
                        KoffieItem ID
                    </th>
                    <th data-v-bf5d2bb8="">
                        KoffieItem Name
                    </th>
                    <th data-v-bf5d2bb8="">
                        KoffieItem Cost
                    </th>
                    <th data-v-bf5d2bb8="">
                        Action
                    </th>
                </tr>
                </thead>
                <tbody data-v-bf5d2bb8="">
                <tr v-for="koffieItem in koffieItems" :key="koffieItem.id">
                    <td>{{ koffieItem.id }}</td>
                    <td>{{ koffieItem.name }}</td>
                    <td>{{ koffieItem._cost }}</td>
                    <td data-v-bf5d2bb8="">
                        <a data-v-bf5d2bb8="" href="#" class="icon">
                            <i data-v-bf5d2bb8="" class="fa fa-trash">

                            </i>
                        </a>
                        <a data-v-bf5d2bb8="" href="#" class="icon">
                            <i data-v-bf5d2bb8="" class="fa fa-pencil">

                            </i>
                        </a>
                        <a data-v-bf5d2bb8="" href="#/product/PhLZuMwkEXFko2FL10VA" class="icon">
                            <i data-v-bf5d2bb8="" class="fa fa-eye">

                            </i>
                        </a>
                    </td>
                </tr>
                </tbody>
            </table>
        </div>
    </div>
</div>
    
</template>
    
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script>
    
</script>

<style scoped>
    
</style>

