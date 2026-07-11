package yc;

import QmE.j;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.safedk.android.analytics.brandsafety.FileUploadManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class psW extends RecyclerView.Adapter implements rfW {
    private BitmapDrawable J2;
    private Map KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private j f76089O;
    private boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Context f76090n;
    private List nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final QmE.iF f76091t;

    public interface j {
        void n(int i2);
    }

    public static final class n implements j {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ Function1 f76092n;

        n(Function1 function1) {
            this.f76092n = function1;
        }

        @Override // yc.psW.j
        public void n(int i2) {
            this.f76092n.invoke(Integer.valueOf(i2));
        }
    }

    public psW(Context context, int i2, QmE.iF eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.f76090n = context;
        this.rl = i2;
        this.f76091t = eventLogger;
        List listSplit$default = StringsKt.split$default((CharSequence) com.alightcreative.app.motion.persist.j.INSTANCE.getColorSelector(), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(HI0.gnv.Uo((String) it.next())));
        }
        this.nr = CollectionsKt.toMutableList((Collection) arrayList);
        this.Uo = true;
        Context context2 = this.f76090n;
        if (context2 != null) {
            Drawable drawable = context2.getResources().getDrawable(2131232325, null);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(this.f76090n.getResources().getDimensionPixelOffset(2131166376), this.f76090n.getResources().getDimensionPixelOffset(2131166376), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
            drawable.draw(canvas);
            BitmapDrawable bitmapDrawable = new BitmapDrawable(this.f76090n.getResources(), bitmapCreateBitmap);
            Shader.TileMode tileMode = Shader.TileMode.REPEAT;
            bitmapDrawable.setTileModeXY(tileMode, tileMode);
            this.J2 = bitmapDrawable;
        }
        this.KN = new LinkedHashMap();
    }

    @Override // yc.rfW
    public void O(int i2) {
        if (i2 > -1) {
            g("delete_color", new Function0() { // from class: yc.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return psW.Z(this.f76000n);
                }
            });
            this.nr.remove(i2);
            notifyItemRemoved(i2);
        }
    }

    private final void WPU() {
        com.alightcreative.app.motion.persist.j.INSTANCE.setColorSelector(CollectionsKt.joinToString$default(this.nr, ",", null, null, 0, null, new Function1() { // from class: yc.K
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return psW.aYN(((Integer) obj).intValue());
            }
        }, 30, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit XQ(psW psw) {
        QmE.iF iFVar = psw.f76091t;
        Bundle bundle = new Bundle();
        bundle.putString(FileUploadManager.f61572j, "move_color");
        Unit unit = Unit.INSTANCE;
        iFVar.n(new j.fuX("palette_edit_action", bundle));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(psW psw) {
        QmE.iF iFVar = psw.f76091t;
        Bundle bundle = new Bundle();
        bundle.putString(FileUploadManager.f61572j, "delete_color");
        Unit unit = Unit.INSTANCE;
        iFVar.n(new j.fuX("palette_edit_action", bundle));
        return Unit.INSTANCE;
    }

    public final void HI(int i2) {
        this.nr.add(Integer.valueOf(i2));
        WPU();
        notifyDataSetChanged();
    }

    public final int Ik(int i2) {
        return ((Number) this.nr.get(i2)).intValue();
    }

    public final void S() {
        List listSplit$default = StringsKt.split$default((CharSequence) com.alightcreative.app.motion.persist.j.INSTANCE.getColorSelector(), new String[]{","}, false, 0, 6, (Object) null);
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(listSplit$default, 10));
        Iterator it = listSplit$default.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(HI0.gnv.Uo((String) it.next())));
        }
        this.nr = CollectionsKt.toMutableList((Collection) arrayList);
        notifyDataSetChanged();
    }

    public final void ViF(boolean z2) {
        if (this.Uo != z2) {
            this.Uo = z2;
            notifyDataSetChanged();
        }
    }

    public final boolean ck(int i2) {
        return this.nr.contains(Integer.valueOf(i2));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.nr.size();
    }

    @Override // yc.rfW
    public boolean gh(int i2, int i3) {
        if (i2 < 0 || i3 < 0) {
            return false;
        }
        g("move_color", new Function0() { // from class: yc.Lu
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return psW.XQ(this.f75803n);
            }
        });
        if (i2 < i3) {
            int i5 = i2;
            while (i5 < i3) {
                int i7 = i5 + 1;
                Collections.swap(this.nr, i5, i7);
                i5 = i7;
            }
        } else {
            int i8 = i3 + 1;
            if (i8 <= i2) {
                int i9 = i2;
                while (true) {
                    Collections.swap(this.nr, i9, i9 - 1);
                    if (i9 == i8) {
                        break;
                    }
                    i9--;
                }
            }
        }
        notifyItemMoved(i2, i3);
        WPU();
        return true;
    }

    public final void nY(Function1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f76089O = new n(listener);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public vd onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        SJ0.Sis sisT = SJ0.Sis.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNullExpressionValue(sisT, "inflate(...)");
        return new vd(sisT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(vd holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.O(((Number) this.nr.get(i2)).intValue(), this.f76089O, this.J2, this.rl, this.Uo);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence aYN(int i2) {
        return HI0.qf.rl(i2);
    }

    private final void g(String str, Function0 function0) {
        long jNanoTime = System.nanoTime();
        Map map = this.KN;
        Object obj = map.get(str);
        if (obj == null) {
            obj = 0L;
            map.put(str, obj);
        }
        if ((jNanoTime - ((Number) obj).longValue()) / 1000000 > 15000) {
            function0.invoke();
        }
        this.KN.put(str, Long.valueOf(jNanoTime));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public psW(Context context, QmE.iF eventLogger) {
        this(context, -1, eventLogger);
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
    }
}
