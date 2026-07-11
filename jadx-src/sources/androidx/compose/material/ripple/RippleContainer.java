package androidx.compose.material.ripple;

import android.content.Context;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.media3.exoplayer.upstream.CmcdData;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0011\u0010\u0018\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0011\u0010\u001a\u001a\u00020\r*\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\b8\u0002X\u0082D¢\u0006\u0006\n\u0004\b\u001a\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001fR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00170\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u001fR\u0014\u0010&\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0016\u0010'\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\u001c¨\u0006("}, d2 = {"Landroidx/compose/material/ripple/RippleContainer;", "Landroid/view/ViewGroup;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "changed", "", CmcdData.STREAM_TYPE_LIVE, "t", "r", "b", "", "onLayout", "(ZIIII)V", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "requestLayout", "()V", "Landroidx/compose/material/ripple/RippleHostKey;", "Landroidx/compose/material/ripple/RippleHostView;", "rl", "(Landroidx/compose/material/ripple/RippleHostKey;)Landroidx/compose/material/ripple/RippleHostView;", c.f62177j, "(Landroidx/compose/material/ripple/RippleHostKey;)V", "I", "MaxRippleHosts", "", "Ljava/util/List;", "rippleHosts", "O", "unusedRippleHosts", "Landroidx/compose/material/ripple/RippleHostMap;", "J2", "Landroidx/compose/material/ripple/RippleHostMap;", "rippleHostMap", "nextHostIndex", "material-ripple_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nRippleContainer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 RippleContainer.android.kt\nandroidx/compose/material/ripple/RippleContainer\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,186:1\n1#2:187\n*E\n"})
public final class RippleContainer extends ViewGroup {

    /* JADX INFO: renamed from: J2, reason: from kotlin metadata */
    private final RippleHostMap rippleHostMap;

    /* JADX INFO: renamed from: O, reason: collision with root package name and from kotlin metadata */
    private final List unusedRippleHosts;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final int MaxRippleHosts;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private int nextHostIndex;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final List rippleHosts;

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l2, int t3, int r2, int b2) {
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        setMeasuredDimension(0, 0);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
    }

    public final RippleHostView rl(RippleHostKey rippleHostKey) {
        RippleHostView rippleHostViewRl = this.rippleHostMap.rl(rippleHostKey);
        if (rippleHostViewRl != null) {
            return rippleHostViewRl;
        }
        RippleHostView rippleHostView = (RippleHostView) CollectionsKt.removeFirstOrNull(this.unusedRippleHosts);
        if (rippleHostView == null) {
            if (this.nextHostIndex > CollectionsKt.getLastIndex(this.rippleHosts)) {
                rippleHostView = new RippleHostView(getContext());
                addView(rippleHostView);
                this.rippleHosts.add(rippleHostView);
            } else {
                rippleHostView = (RippleHostView) this.rippleHosts.get(this.nextHostIndex);
                RippleHostKey rippleHostKeyN = this.rippleHostMap.n(rippleHostView);
                if (rippleHostKeyN != null) {
                    rippleHostKeyN.NP();
                    this.rippleHostMap.t(rippleHostKeyN);
                    rippleHostView.nr();
                }
            }
            int i2 = this.nextHostIndex;
            if (i2 < this.MaxRippleHosts - 1) {
                this.nextHostIndex = i2 + 1;
            } else {
                this.nextHostIndex = 0;
            }
        }
        this.rippleHostMap.nr(rippleHostKey, rippleHostView);
        return rippleHostView;
    }

    public RippleContainer(Context context) {
        super(context);
        this.MaxRippleHosts = 5;
        ArrayList arrayList = new ArrayList();
        this.rippleHosts = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.unusedRippleHosts = arrayList2;
        this.rippleHostMap = new RippleHostMap();
        setClipChildren(false);
        RippleHostView rippleHostView = new RippleHostView(context);
        addView(rippleHostView);
        arrayList.add(rippleHostView);
        arrayList2.add(rippleHostView);
        this.nextHostIndex = 1;
        setTag(androidx.compose.ui.R.id.nHg, Boolean.TRUE);
    }

    public final void n(RippleHostKey rippleHostKey) {
        rippleHostKey.NP();
        RippleHostView rippleHostViewRl = this.rippleHostMap.rl(rippleHostKey);
        if (rippleHostViewRl != null) {
            rippleHostViewRl.nr();
            this.rippleHostMap.t(rippleHostKey);
            this.unusedRippleHosts.add(rippleHostViewRl);
        }
    }
}
