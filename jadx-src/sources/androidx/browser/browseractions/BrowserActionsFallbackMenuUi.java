package androidx.browser.browseractions;

import android.app.PendingIntent;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.RestrictTo;
import androidx.annotation.VisibleForTesting;
import androidx.browser.R;
import androidx.core.widget.TextViewCompat;
import java.util.List;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
@Deprecated
class BrowserActionsFallbackMenuUi implements AdapterView.OnItemClickListener {
    BrowserActionsFallMenuUiListener J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final List f14509O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    final Context f14510n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private BrowserActionsFallbackMenuDialog f14511r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    final Uri f14512t;

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$1, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass1 implements Runnable {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ BrowserActionsFallbackMenuUi f14513n;

        @Override // java.lang.Runnable
        public void run() {
            ((ClipboardManager) this.f14513n.f14510n.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("url", this.f14513n.f14512t.toString()));
            Toast.makeText(this.f14513n.f14510n, this.f14513n.f14510n.getString(R.string.f14496n), 0).show();
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$2, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass2 implements DialogInterface.OnShowListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ View f14514n;
        final /* synthetic */ BrowserActionsFallbackMenuUi rl;

        @Override // android.content.DialogInterface.OnShowListener
        public void onShow(DialogInterface dialogInterface) {
            BrowserActionsFallMenuUiListener browserActionsFallMenuUiListener = this.rl.J2;
            if (browserActionsFallMenuUiListener == null) {
                Log.e("BrowserActionskMenuUi", "Cannot trigger menu item listener, it is null");
            } else {
                browserActionsFallMenuUiListener.n(this.f14514n);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.browser.browseractions.BrowserActionsFallbackMenuUi$3, reason: invalid class name */
    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
    class AnonymousClass3 implements View.OnClickListener {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ TextView f14515n;

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            if (TextViewCompat.nr(this.f14515n) == Integer.MAX_VALUE) {
                this.f14515n.setMaxLines(1);
                this.f14515n.setEllipsize(TextUtils.TruncateAt.END);
            } else {
                this.f14515n.setMaxLines(Integer.MAX_VALUE);
                this.f14515n.setEllipsize(null);
            }
        }
    }

    @RestrictTo
    @VisibleForTesting
    interface BrowserActionsFallMenuUiListener {
        void n(View view);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        BrowserActionItem browserActionItem = (BrowserActionItem) this.f14509O.get(i2);
        if (browserActionItem.n() != null) {
            try {
                browserActionItem.n().send();
            } catch (PendingIntent.CanceledException e2) {
                Log.e("BrowserActionskMenuUi", "Failed to send custom item action", e2);
            }
        } else if (browserActionItem.nr() != null) {
            browserActionItem.nr().run();
        }
        BrowserActionsFallbackMenuDialog browserActionsFallbackMenuDialog = this.f14511r;
        if (browserActionsFallbackMenuDialog == null) {
            Log.e("BrowserActionskMenuUi", "Cannot dismiss dialog, it has already been dismissed.");
        } else {
            browserActionsFallbackMenuDialog.dismiss();
        }
    }
}
