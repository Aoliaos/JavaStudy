import java.util.*;

class TestList {
	public static void main(String[] args){ 
		//List<Photo> album = new ArrayList<Photo>(); //泛型    线性表   <Photo>可省略
		List<Photo> album = new LinkedList<>(); 

		album.add( new Photo("one",new Date(), "classroom"));
		album.add( new Photo("two",new Date(), "library"));
		album.add( new Photo("three",new Date(), "gym"));
		album.add( new Photo("three",new Date(), "dorm"));

		Iterator<Photo> iterator = album.iterator();//遍历
		while(iterator.hasNext()){
			Photo photo = iterator.next();
			System.out.println( photo.toString() );
		}

		for( Photo photo : album ){  
			System.out.println( photo );//增强的for语句,与while一致
		}
	}
}
class Photo {
	String title;
	Date date;
	String memo;
	Photo(String title, Date date, String memo){
		this.title = title;
		this.date = date;
		this.memo = memo;
	}
	@Override
	public String toString(){
		return title + "(" + date + ")" + memo;
	}
}
