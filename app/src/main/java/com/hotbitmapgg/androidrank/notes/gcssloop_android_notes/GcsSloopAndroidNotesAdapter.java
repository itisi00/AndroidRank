package com.hotbitmapgg.androidrank.notes.gcssloop_android_notes;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.hotbitmapgg.studyproject.R;
import com.hotbitmapgg.androidrank.widget.recyclehelper.AbsRecyclerViewAdapter;

import java.util.ArrayList;
import java.util.List;

public class GcsSloopAndroidNotesAdapter extends AbsRecyclerViewAdapter
{

    private List<GcsSloopAndroidNotes> notes = new ArrayList<>();


    public GcsSloopAndroidNotesAdapter(RecyclerView recyclerView, List<GcsSloopAndroidNotes> notes)
    {

        super(recyclerView);
        this.notes = notes;
    }

    @Override
    public ClickableViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {

        bindContext(parent.getContext());
        return new ItemViewHolder(LayoutInflater.from(getContext()).inflate(R.layout.item_notes, parent, false));
    }

    @Override
    public void onBindViewHolder(ClickableViewHolder holder, int position)
    {

        if (holder instanceof ItemViewHolder)
        {
            ItemViewHolder itemViewHolder = (ItemViewHolder) holder;
            itemViewHolder.mChapter.setText(notes.get(position).title);
            itemViewHolder.mName.setText("GcsSloop");
        }
        super.onBindViewHolder(holder, position);
    }

    @Override
    public int getItemCount()
    {

        return notes.size();
    }

    private class ItemViewHolder extends ClickableViewHolder
    {

        public TextView mChapter;

        public TextView mName;

        public ItemViewHolder(View itemView)
        {

            super(itemView);
            mChapter = $(R.id.tv_chapter);
            mName = $(R.id.tv_name);
        }
    }
}
