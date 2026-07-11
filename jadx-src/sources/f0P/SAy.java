package f0P;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.scene.SceneElement;
import com.alightcreative.app.motion.scene.liveshape.LiveShape;
import com.alightcreative.app.motion.scene.liveshape.LiveShapeKt;
import com.alightcreative.app.motion.scene.liveshape.ShapeHandle;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\b\u0017\u0018\u0000  2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001!B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ+\u0010\u0012\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J!\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0017\u0010\u0005J\u000f\u0010\u0018\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0005R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006\""}, d2 = {"Lf0P/SAy;", "Lf0P/wl0;", "Lyc/H;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Lcom/alightcreative/app/motion/scene/SceneElement;", "el", "", "fD", "(Lcom/alightcreative/app/motion/scene/SceneElement;)V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "onDestroyView", "nr", "LSJ0/AZy;", com.safedk.android.analytics.brandsafety.creatives.discoveries.c.f62177j, "LSJ0/AZy;", "_binding", "nY", "()LSJ0/AZy;", "binding", "t", "j", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nLiveShapeActionBarFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LiveShapeActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/LiveShapeActionBarFragment\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,101:1\n1#2:102\n1755#3,3:103\n*S KotlinDebug\n*F\n+ 1 LiveShapeActionBarFragment.kt\ncom/alightcreative/app/motion/activities/edit/fragments/LiveShapeActionBarFragment\n*L\n91#1:103,3\n*E\n"})
public class SAy extends Fragment implements wl0, yc.H {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private SJ0.AZy _binding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public static final int f64683O = 8;

    /* JADX INFO: renamed from: f0P.SAy$j, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SAy n(int i2, int... overflowOptions) {
            Intrinsics.checkNotNullParameter(overflowOptions, "overflowOptions");
            SAy sAy = new SAy();
            Bundle bundle = new Bundle();
            bundle.putInt("setting_name_rsrc", i2);
            bundle.putIntArray("overflow_options", ArraysKt.toIntArray(ArraysKt.toTypedArray(overflowOptions)));
            sAy.setArguments(bundle);
            return sAy;
        }
    }

    private final SJ0.AZy nY() {
        SJ0.AZy aZy = this._binding;
        Intrinsics.checkNotNull(aZy);
        return aZy;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = SJ0.AZy.t(inflater, container, false);
        LinearLayout root = nY().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        return root;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        String string;
        Intrinsics.checkNotNullParameter(view, "view");
        HI0.o7q.gh(view);
        ImageButton imageButton = nY().f9081O;
        com.alightcreative.app.motion.persist.j jVar = com.alightcreative.app.motion.persist.j.INSTANCE;
        imageButton.setActivated(jVar.getLiveShapeLockAspect());
        nY().nr.setActivated(jVar.getLiveShapeSizeFromCenter());
        nY().f9081O.setOnClickListener(new View.OnClickListener() { // from class: f0P.rG
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SAy.g(this.f66104n, view2);
            }
        });
        nY().nr.setOnClickListener(new View.OnClickListener() { // from class: f0P.ss3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SAy.te(this.f66178n, view2);
            }
        });
        nY().rl.setOnClickListener(new View.OnClickListener() { // from class: f0P.Ygn
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                SAy.iF(this.f65124n, view2);
            }
        });
        Bundle arguments = getArguments();
        int i2 = arguments != null ? arguments.getInt("setting_name_rsrc", 0) : 0;
        if (i2 != 0) {
            nY().f9083t.setText(i2);
        } else {
            TextView textView = nY().f9083t;
            Bundle arguments2 = getArguments();
            if (arguments2 == null || (string = arguments2.getString("setting_name")) == null) {
                string = "";
            }
            textView.setText(string);
        }
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            fD(sceneElementNHg);
        }
    }

    private final void fD(SceneElement el) {
        List<ShapeHandle> handles;
        if (getView() == null) {
            return;
        }
        LiveShape shape = LiveShapeKt.getShape(el.getLiveShape());
        boolean z2 = false;
        if (shape != null && (handles = shape.getHandles()) != null && !handles.isEmpty()) {
            Iterator<T> it = handles.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((ShapeHandle) it.next()).getLockRatio()) {
                    z2 = true;
                    break;
                }
            }
        }
        nY().f9081O.setEnabled(z2);
        nY().nr.setEnabled(z2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(SAy sAy, View view) {
        int i2;
        sAy.nY().f9081O.setActivated(!sAy.nY().f9081O.isActivated());
        if (sAy.nY().f9081O.isActivated()) {
            i2 = 2132017277;
        } else {
            i2 = 2132017278;
        }
        HW.C.M7(sAy, i2);
        com.alightcreative.app.motion.persist.j.INSTANCE.setLiveShapeLockAspect(sAy.nY().f9081O.isActivated());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void iF(SAy sAy, View view) {
        if (sAy.isAdded()) {
            sAy.getParentFragmentManager().Zmq();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void te(SAy sAy, View view) {
        int i2;
        sAy.nY().nr.setActivated(!sAy.nY().nr.isActivated());
        if (sAy.nY().nr.isActivated()) {
            i2 = 2132020179;
        } else {
            i2 = 2132020180;
        }
        HW.C.M7(sAy, i2);
        com.alightcreative.app.motion.persist.j.INSTANCE.setLiveShapeSizeFromCenter(sAy.nY().nr.isActivated());
    }

    @Override // yc.H
    public void nr() {
        SceneElement sceneElementNHg = HW.C.nHg(this);
        if (sceneElementNHg != null) {
            fD(sceneElementNHg);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this._binding = null;
    }
}
