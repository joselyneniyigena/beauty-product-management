package com.web.beauty.product.management.service;

import com.web.beauty.product.management.model.Review;

import java.util.List;

public interface ReviewService {
    List<Review> getAllReviews();
    Review getReviewById(Long id);
    Review saveReview(Review review);
    void deleteReview(Long id);
}
