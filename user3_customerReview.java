package com.example.finalproject;

public class user3_customerReview {
    private String reviewerName, comment;
    private int rating;

    public user3_customerReview(String reviewerName, String comment, int rating){
        this.reviewerName= reviewerName;
        this.comment= comment;
        this.rating= rating;
    }

    public String getReviewerName() {
        return reviewerName;
    }

    public user3_customerReview setReviewerName(String reviewerName) {
        this.reviewerName = reviewerName;
        return this;
    }

    public String getComment() {
        return comment;
    }

    public user3_customerReview setComment(String comment) {
        this.comment = comment;
        return this;
    }

    public int getRating() {
        return rating;
    }

    public user3_customerReview setRating(int rating) {
        this.rating = rating;
        return this;
    }

    @Override
    public String toString() {
        return "user3_viewReview{" +
                "reviewerName='" + reviewerName + '\'' +
                ", comment='" + comment + '\'' +
                ", rating=" + rating +
                '}';
    }
}
