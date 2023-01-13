package test;

import java.util.Objects;
import java.util.Optional;


public class caller {

	public static void main(String[] args) {

		AssetUplodMsg sitUrl = AssetUplodMsg.valueOf("LP");
		System.out.println(sitUrl.getMsg());
	}

}
