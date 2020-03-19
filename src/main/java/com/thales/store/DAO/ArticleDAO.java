package com.thales.store.DAO;

import com.thales.store.model.Article;

public interface ArticleDAO {

    public void insert(Article article);
    public Article findByName(int articleName);
    
}
