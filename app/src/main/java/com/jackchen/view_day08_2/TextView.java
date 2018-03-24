package com.jackchen.view_day08_2;

import android.content.Context;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Email: 2185134304@qq.com
 * Created by JackChen 2018/3/24 9:44
 * Version 1.0
 * Params:
 * Description:    测量模式计算方式
*/
public class TextView extends View {
    public TextView(Context context) {
        super(context);
    }

    public TextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);

        // 指定宽高
        // widthMeasureSpec = childWidthMeasureSpec
        // heightMeasureSpec = childHeightMeasureSpec

        // 我们之前讲的
        // wrap_content = AT_MOST
        // match_parent 、fill_parent、100dp = Exactly

        // 测量模式和大小是由父布局和它的孩子决定的，比方说：

        // 父布局是包裹内容，就算子布局是match_parent，这个是时候的测量模式还是 AT_MOST
        // 父布局是match_parent，就算子布局是match_parent，这个时候的测量模式是 EXACTLY

//        setMeasuredDimension();

    }
}
