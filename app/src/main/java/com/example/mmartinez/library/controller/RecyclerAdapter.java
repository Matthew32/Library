package com.example.mmartinez.library.controller;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mmartinez.library.model.Book;

import java.util.List;

/**
 * Created by mmartinez on 27/10/2016.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {
    // rellenar con libros de la api que falta por crear D.
    private List<Book> books;
    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        // each data item is just a string in this case
        public List<View> mTextView;
        private ImageView iv_image;
        private TextView tv;

        public ViewHolder(View v) {
            super(v);
            //REV20161027 faltan assignar los valores someday .D
        }
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return null;
    }

    @Override
    public void onBindViewHolder(RecyclerAdapter.ViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public RecyclerAdapter(List<Book> books) {
        this.books = books;
    }

}
