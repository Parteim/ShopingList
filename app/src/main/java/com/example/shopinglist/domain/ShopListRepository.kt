package com.example.shopinglist.domain

interface ShopListRepository {
    fun addShopItem(shopItem: ShopItem)

    fun deleteShopItem(ShopItem: ShopItem)
    fun editShopItem(ShopItem: ShopItem)
    fun getShopItem(id: Int): ShopItem
    fun getShopList(): List<ShopItem>
}