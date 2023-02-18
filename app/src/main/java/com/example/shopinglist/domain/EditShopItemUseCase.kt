package com.example.shopinglist.domain

class EditShopItemUseCase(val shopListRepository: ShopListRepository) {
    fun editShopItem(shopItem: ShopItem) {
        shopListRepository.editShopItem(shopItem)

    }
}