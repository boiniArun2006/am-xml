package androidx.browser.browseractions;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.browser.R;
import androidx.core.content.res.ResourcesCompat;
import com.google.common.util.concurrent.Xo;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@Deprecated
class BrowserActionsFallbackMenuAdapter extends BaseAdapter {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f14500n;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Context f14501t;

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    static class ViewHolderItem {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final ImageView f14506n;
        final TextView rl;

        ViewHolderItem(ImageView imageView, TextView textView) {
            this.f14506n = imageView;
            this.rl = textView;
        }
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f14500n.size();
    }

    @Override // android.widget.Adapter
    public Object getItem(int i2) {
        return this.f14500n.get(i2);
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        final ViewHolderItem viewHolderItem;
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f14500n.get(i2);
        if (view == null) {
            view = LayoutInflater.from(this.f14501t).inflate(R.layout.f14495n, (ViewGroup) null);
            ImageView imageView = (ImageView) view.findViewById(R.id.f14494n);
            TextView textView = (TextView) view.findViewById(R.id.rl);
            if (imageView == null || textView == null) {
                throw new IllegalStateException("Browser Actions fallback UI does not contain necessary Views.");
            }
            viewHolderItem = new ViewHolderItem(imageView, textView);
            view.setTag(viewHolderItem);
        } else {
            viewHolderItem = (ViewHolderItem) view.getTag();
        }
        final String strO = browserActionItem.O();
        viewHolderItem.rl.setText(strO);
        if (browserActionItem.rl() != 0) {
            viewHolderItem.f14506n.setImageDrawable(ResourcesCompat.J2(this.f14501t.getResources(), browserActionItem.rl(), null));
            return view;
        }
        if (browserActionItem.t() != null) {
            final Xo xoQie = BrowserServiceFileProvider.qie(this.f14501t.getContentResolver(), browserActionItem.t());
            xoQie.addListener(new Runnable() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.1
                @Override // java.lang.Runnable
                public void run() {
                    Bitmap bitmap;
                    if (TextUtils.equals(strO, viewHolderItem.rl.getText())) {
                        try {
                            bitmap = (Bitmap) xoQie.get();
                        } catch (InterruptedException | ExecutionException unused) {
                            bitmap = null;
                        }
                        if (bitmap != null) {
                            viewHolderItem.f14506n.setVisibility(0);
                            viewHolderItem.f14506n.setImageBitmap(bitmap);
                        } else {
                            viewHolderItem.f14506n.setVisibility(4);
                            viewHolderItem.f14506n.setImageBitmap(null);
                        }
                    }
                }
            }, new Executor() { // from class: androidx.browser.browseractions.BrowserActionsFallbackMenuAdapter.2
                @Override // java.util.concurrent.Executor
                public void execute(Runnable runnable) {
                    runnable.run();
                }
            });
            return view;
        }
        viewHolderItem.f14506n.setImageBitmap(null);
        viewHolderItem.f14506n.setVisibility(4);
        return view;
    }
}
