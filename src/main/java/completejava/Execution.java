package completejava;

public class Execution {

	public static void main (String[] args) {
		Addition.divide(8, 9);
		CreatingList.creatinglist();
		System.out.println();
		CreatingMap obj=new CreatingMap();
				obj.createhashmap();
				CreatingMap.creatingtreemap();
				String s=CreatingList.creatinganimals();
				System.out.println(s);
				CreatingList.creatingbirds();
				CreatingSet.creatingHashSet();
	}
}
