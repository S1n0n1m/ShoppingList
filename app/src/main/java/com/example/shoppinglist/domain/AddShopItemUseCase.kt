package com.example.shoppinglist.domain

class AddShopItemUseCase(private val shopListRepository: ShopListRepository) {

    fun getShopItem(shopItemId: ShopItem) {
        shopListRepository.getShopItem(shopItemId)
    }
}