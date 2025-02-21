package model;

import java.util.ArrayList;
import java.util.List;

public class ItemList {
	private List<Item> items;

	public ItemList() {
		this.items = new ArrayList<>();
	}

	/*
	 * 買い物リストに表示するListに追加するメソッド
	 * @param item 追加対象のItemクラスデータ
	 */
	public void addItem(Item item) {
		items.add(item);
	}

	/*
	 * 買い物リストに表示されているListから対象のItemを削除するメソッド
	 * @param item 削除対象のItemクラスデータ
	 */
	public void removeItem(Item item) {
		items.remove(item);
	}

	/*
	 * 買い物リストに表示するList情報を返却するメソッド
	 */
	public List<Item> getItems() {
		return items;
	}
}
