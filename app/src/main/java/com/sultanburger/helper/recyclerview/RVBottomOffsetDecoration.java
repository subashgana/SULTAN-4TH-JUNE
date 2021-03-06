package com.sultanburger.helper.recyclerview;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

public class RVBottomOffsetDecoration extends RecyclerView.ItemDecoration {

    private int bottomOffset;

    public RVBottomOffsetDecoration(int bottomOffset) {
        this.bottomOffset = bottomOffset;
    }

    @Override
    public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        super.getItemOffsets(outRect, view, parent, state);

        int dataSize = state.getItemCount();
        int position = parent.getChildAdapterPosition(view);

        if (dataSize > 0 && position == (dataSize - 1))
            outRect.set(0, 0, 0, bottomOffset);
        else
            outRect.set(0, 0, 0, 0);
    }
}
