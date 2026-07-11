package D5a;

import SJ0.zpl;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public final class Xo extends BaseAdapter {
    private final kgE.fuX J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f1333O;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f1334n;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final Function0 f1335r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f1336t;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bitmap Uo(View view, tu.Z z2, Xo xo) {
        try {
            return view.getContext().getContentResolver().loadThumbnail(z2.nY(), new Size(200, 200), null);
        } catch (IOException e2) {
            XoT.C.mUb(xo, new Function0() { // from class: D5a.Pl
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Xo.KN(e2);
                }
            });
            e2.printStackTrace();
            return null;
        }
    }

    @Override // android.widget.Adapter
    public long getItemId(int i2) {
        return i2;
    }

    public Xo(List list, boolean z2, Function1 onItemClicked, kgE.fuX iapManager, Function0 dismiss) {
        Intrinsics.checkNotNullParameter(list, "list");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(iapManager, "iapManager");
        Intrinsics.checkNotNullParameter(dismiss, "dismiss");
        this.f1334n = list;
        this.f1336t = z2;
        this.f1333O = onItemClicked;
        this.J2 = iapManager;
        this.f1335r = dismiss;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String KN(IOException iOException) {
        return "loadThumbnail Error : " + iOException;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit gh(zpl zplVar, tu.Z z2, Xo xo) {
        zplVar.rl.setText(z2.xMQ() + (O.t(z2, xo.J2) ? " (DEMO)" : ""));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void mUb(Xo xo, tu.Z z2, View view) {
        xo.f1333O.invoke(z2);
        xo.f1335r.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit xMQ(zpl zplVar, tu.Z z2, Bitmap bitmap) {
        if (bitmap != null && Intrinsics.areEqual(zplVar.J2.getTag(), Long.valueOf(z2.Z()))) {
            zplVar.J2.setImageBitmap(bitmap);
        }
        return Unit.INSTANCE;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: J2, reason: merged with bridge method [inline-methods] */
    public tu.Z getItem(int i2) {
        return (tu.Z) this.f1334n.get(i2);
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f1334n.size() + (this.f1336t ? 1 : 0);
    }

    @Override // android.widget.Adapter
    public View getView(int i2, final View view, ViewGroup parent) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (view == null) {
            view = LayoutInflater.from(parent.getContext()).inflate(2131558704, parent, false);
        }
        final zpl zplVarN = zpl.n(view);
        Intrinsics.checkNotNullExpressionValue(zplVarN, "bind(...)");
        if (i2 == 0 && this.f1336t) {
            zplVarN.J2.setVisibility(8);
            zplVarN.nr.setVisibility(8);
            zplVarN.f9702t.setText(parent.getResources().getString(2132017237));
            zplVarN.rl.setText("0");
            Intrinsics.checkNotNull(view);
            return view;
        }
        final tu.Z z2 = (tu.Z) this.f1334n.get(i2);
        if (Build.VERSION.SDK_INT >= 29) {
            zplVarN.J2.setTag(Long.valueOf(z2.Z()));
            zplVarN.J2.setVisibility(0);
            zplVarN.nr.setVisibility(8);
            HI0.qz.t(eO.f1345n, new Function0() { // from class: D5a.aC
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Xo.Uo(view, z2, this);
                }
            }).Uo(new Function1() { // from class: D5a.C
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Xo.xMQ(zplVarN, z2, (Bitmap) obj);
                }
            });
        } else {
            zplVarN.J2.setVisibility(8);
            zplVarN.nr.setVisibility(0);
            Hwc.w6.n();
            SimpleDraweeView simpleDraweeView = zplVarN.nr;
            ImageRequestBuilder imageRequestBuilderAYN = ImageRequestBuilder.aYN(z2.nY());
            imageRequestBuilderAYN.X(true);
            imageRequestBuilderAYN.v(new dX.CN3(200, 200, 0.0f, 0.0f, 12, null));
            simpleDraweeView.setImageRequest(imageRequestBuilderAYN.n());
        }
        zplVarN.Uo.setVisibility(z2.ViF() != tu.Ew.f73884r ? 4 : 0);
        TextView textView = zplVarN.f9702t;
        String strUo = z2.Uo();
        if (strUo == null) {
            strUo = "";
        }
        textView.setText(strUo);
        zplVarN.rl.setText(z2.xMQ() + (O.t(z2, this.J2) ? " (DEMO)" : ""));
        view.setOnClickListener(new View.OnClickListener() { // from class: D5a.o
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Xo.mUb(this.f1377n, z2, view2);
            }
        });
        C1324p c1324p = C1324p.f1379n;
        Intrinsics.checkNotNull(view);
        c1324p.nr(view, z2, this.J2, new Function0() { // from class: D5a.qz
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Xo.gh(zplVarN, z2, this);
            }
        });
        return view;
    }
}
