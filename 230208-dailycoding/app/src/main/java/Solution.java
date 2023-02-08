import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

class Solution {
    class Book {
        private int startTime;
        private int endTime;

        public Book(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        int getStartTime, getEndTime;
    }

    List<Book> bookList = new ArrayList<>();

    int toMinute(String time) {
        StringTokenizer stringTokenizer = new StringTokenizer(time, ":");
        int hour = Integer.parseInt(stringTokenizer.nextToken());
        int minute = Integer.parseInt(stringTokenizer.nextToken());

        return hour * 60 + minute;
    }


    public int solution(String[][] book_times) {
        for(String[] book_time : book_times) {
            int startTime = toMinute(book_time[0]);
            int endTime = toMinute(book_time[1]);

            bookList.add(new Book(startTime, endTime));
        }

        Collections.sort(bookList, ((o1, o2) -> {
            if(o1.startTime == o2.startTime) {
                return o1.endTime - o2.endTime;
            }

            return o1.startTime - o2.startTime;
        }));


        List<Integer> endTimeList = new ArrayList<>();

        for(Book book : bookList) {
            boolean isOk = false;

            Collections.sort(endTimeList);
            for(int i =0; i< endTimeList.size(); i +=1) {
                int endTime = endTimeList.get(i) + 10;

                if(book.startTime >= endTime) {
                    endTimeList.set(i, book.endTime);
                    isOk = true;
                    break;
                }
            }

            if(!isOk) {
                endTimeList.add(book.endTime);
            }
        }
        return endTimeList.size();
    }
}