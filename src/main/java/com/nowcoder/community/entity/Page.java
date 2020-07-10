package com.nowcoder.community.entity;


public class Page {
    private int limit = 10;
    private int currentPageNo = 1;
    private int rows;
    private String path;

        public int getLimit() {
            return limit;
        }

        public void setLimit(int limit) {
            if (limit >= 1 && limit <= 100) {
                this.limit = limit;
            }
        }

        public int getCurrentPageNo() {
            return currentPageNo;
        }

        public void setCurrentPageNo(int currentPageNo) {
            if (currentPageNo >= 1){
                this.currentPageNo = currentPageNo; }
        }

        public int getRows() {
            return rows;
        }

        public void setRows(int rows) {
            if (rows >= 0) {
                this.rows = rows;
            }
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public int getOffset(){
            return (currentPageNo - 1)*limit;
        };

        public int getTotal(){
            if (rows % limit == 0) {
                return rows / limit;
            }
            else {
                return rows / limit + 1;
            }
        }

        public int getFrom(){
            int from = currentPageNo - 2;
            if (from < 1) {return 1;}
            else {return from;}
        }

        public int getTo(){
            int to = currentPageNo + 2;
            int total = getTotal();
            if (to > total ){return total;}
            else{return to;}

        }

    }

