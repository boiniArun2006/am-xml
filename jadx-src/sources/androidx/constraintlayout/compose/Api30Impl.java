package androidx.constraintlayout.compose;

import android.view.View;
import androidx.annotation.RequiresApi;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@RequiresApi
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/constraintlayout/compose/Api30Impl;", "", "<init>", "()V", "Landroid/view/View;", "view", "", c.f62177j, "(Landroid/view/View;)Z", "constraintlayout-compose_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
final class Api30Impl {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final Api30Impl f34405n = new Api30Impl();

    private Api30Impl() {
    }

    public static final boolean n(View view) {
        return view.isShowingLayoutBounds();
    }
}
