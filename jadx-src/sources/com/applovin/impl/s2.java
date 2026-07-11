package com.applovin.impl;

import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.applovin.sdk.AppLovinSdkUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public abstract class s2 extends BaseAdapter implements View.OnClickListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f49908a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private List f49909b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map f49910c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private a f49911d;

    public interface a {
        void a(j2 j2Var, r2 r2Var);
    }

    protected r2 a() {
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean areAllItemsEnabled() {
        return false;
    }

    protected abstract int b();

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public r2 getItem(int i2) {
        return (r2) this.f49909b.get(i2);
    }

    protected abstract List c(int i2);

    public void c() {
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.impl.g62
            @Override // java.lang.Runnable
            public final void run() {
                this.f48593n.notifyDataSetChanged();
            }
        });
    }

    protected abstract int d(int i2);

    protected abstract r2 e(int i2);

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    public void a(a aVar) {
        this.f49911d = aVar;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f49909b.size();
    }

    @Override // android.widget.BaseAdapter
    public void notifyDataSetChanged() {
        int i2;
        this.f49909b = new ArrayList();
        int iB = b();
        this.f49910c = new HashMap(iB);
        r2 r2VarA = a();
        if (r2VarA != null) {
            this.f49909b.add(r2VarA);
            i2 = 1;
        } else {
            i2 = 0;
        }
        for (int i3 = 0; i3 < iB; i3++) {
            int iD = d(i3);
            if (iD != 0) {
                this.f49909b.add(e(i3));
                this.f49909b.addAll(c(i3));
                this.f49910c.put(Integer.valueOf(i3), Integer.valueOf(i2));
                i2 += iD + 1;
            }
        }
        this.f49909b.add(new v4(""));
        super.notifyDataSetChanged();
    }

    protected s2(Context context) {
        this.f49908a = context.getApplicationContext();
    }

    private j2 a(int i2) {
        for (int i3 = 0; i3 < b(); i3++) {
            Integer num = (Integer) this.f49910c.get(Integer.valueOf(i3));
            if (num != null) {
                if (i2 <= num.intValue() + d(i3)) {
                    return new j2(i3, i2 - (num.intValue() + 1));
                }
            }
        }
        return null;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getItemViewType(int i2) {
        return getItem(i2).m();
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        q2 q2Var;
        r2 item = getItem(i2);
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(item.j(), viewGroup, false);
            q2Var = new q2();
            q2Var.f49788a = (TextView) view.findViewById(R.id.text1);
            q2Var.f49789b = (TextView) view.findViewById(R.id.text2);
            q2Var.f49790c = (ImageView) view.findViewById(com.applovin.sdk.R.id.imageView);
            q2Var.f49791d = (ImageView) view.findViewById(com.applovin.sdk.R.id.detailImageView);
            view.setTag(q2Var);
            view.setOnClickListener(this);
            view.setBackground(a(view));
        } else {
            q2Var = (q2) view.getTag();
        }
        q2Var.a(i2);
        q2Var.a(item);
        view.setEnabled(item.o());
        return view;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public int getViewTypeCount() {
        return r2.n();
    }

    @Override // android.widget.BaseAdapter, android.widget.ListAdapter
    public boolean isEnabled(int i2) {
        return getItem(i2).o();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        q2 q2Var = (q2) view.getTag();
        r2 r2VarB = q2Var.b();
        j2 j2VarA = a(q2Var.a());
        a aVar = this.f49911d;
        if (aVar != null && j2VarA != null) {
            aVar.a(j2VarA, r2VarB);
        }
    }

    private Drawable a(View view) {
        Drawable background = view.getBackground();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(m0.a(com.applovin.sdk.R.color.applovin_sdk_highlightListItemColor, this.f49908a));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, gradientDrawable);
        stateListDrawable.addState(new int[0], background);
        return stateListDrawable;
    }
}
