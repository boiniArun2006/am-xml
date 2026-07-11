package D5a;

import D5a.j;
import SJ0.C1460m;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.persist.j;
import com.alightcreative.app.motion.scene.TimeKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.NoWhenBranchMatchedException;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.properties.Delegates;
import kotlin.properties.ObservableProperty;
import kotlin.properties.ReadWriteProperty;
import kotlin.reflect.KProperty;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes2.dex */
public final class j extends RecyclerView.Adapter {
    private final Function1 J2;
    private int KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f1358O;
    private final ReadWriteProperty Uo;
    private int gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List f1359n;
    private final Function1 nr;
    private final j.EnumC0648j rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Dsr f1360t;
    private boolean xMQ;
    static final /* synthetic */ KProperty[] az = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(j.class, "playingUri", "getPlayingUri()Landroid/net/Uri;", 0))};
    public static final C0047j qie = new C0047j(null);
    public static final int ty = 8;
    private static final ExecutorService HI = Executors.newSingleThreadExecutor();

    public static final class Ml extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ j f1361n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ml(Object obj, j jVar) {
            super(obj);
            this.f1361n = jVar;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            Uri uri = (Uri) obj2;
            if (Intrinsics.areEqual((Uri) obj, uri)) {
                return;
            }
            this.f1361n.g(true);
            j jVar = this.f1361n;
            Iterator it = jVar.f1359n.iterator();
            int i2 = 0;
            while (true) {
                if (!it.hasNext()) {
                    i2 = -1;
                    break;
                } else if (Intrinsics.areEqual(((tu.Z) it.next()).nY(), uri)) {
                    break;
                } else {
                    i2++;
                }
            }
            jVar.te(i2);
            this.f1361n.notifyDataSetChanged();
        }
    }

    /* JADX INFO: renamed from: D5a.j$j, reason: collision with other inner class name */
    public static final class C0047j {
        public /* synthetic */ C0047j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C0047j() {
        }
    }

    public final class n extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f1362n;
        final /* synthetic */ j rl;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap qie(n nVar, tu.Z z2) {
            try {
                return nVar.itemView.getContext().getContentResolver().loadThumbnail(z2.nY(), new Size(200, 200), null);
            } catch (IOException e2) {
                XoT.C.mUb(nVar, new Function0() { // from class: D5a.fuX
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.n.az(e2);
                    }
                });
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: renamed from: D5a.j$n$j, reason: collision with other inner class name */
        public /* synthetic */ class C0048j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[j.EnumC0648j.values().length];
                try {
                    iArr[j.EnumC0648j.f45858t.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[j.EnumC0648j.f45853O.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[j.EnumC0648j.J2.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(j jVar, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = jVar;
            this.f1362n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String az(IOException iOException) {
            return "loadThumbnail Error : " + iOException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit ty(n nVar, tu.Z z2, Bitmap bitmap) {
            if (bitmap != null && Intrinsics.areEqual(((C1460m) nVar.f1362n).J2.getTag(), Long.valueOf(z2.Z()))) {
                ((C1460m) nVar.f1362n).J2.setImageBitmap(bitmap);
            }
            return Unit.INSTANCE;
        }

        public final void gh(final tu.Z info) {
            String strT;
            Intrinsics.checkNotNullParameter(info, "info");
            ViewBinding viewBinding = this.f1362n;
            Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AudiobrowserAudioItemBinding");
            AppCompatTextView albumTitle = ((C1460m) this.f1362n).nr;
            Intrinsics.checkNotNullExpressionValue(albumTitle, "albumTitle");
            HI0.afx.ViF(albumTitle, 2.0f, 0.0f, 0.0f, 1426063360);
            TextView albumInfo = ((C1460m) this.f1362n).f9525t;
            Intrinsics.checkNotNullExpressionValue(albumInfo, "albumInfo");
            HI0.afx.ViF(albumInfo, 2.0f, 0.0f, 0.0f, 1426063360);
            if (info.nr() == null) {
                Integer[] numArr = {2131231208, 2131231209, 2131231210, 2131231211, 2131231212, 2131231213};
                String strHI = info.HI();
                if (strHI == null) {
                    strHI = String.valueOf(info.Z());
                }
                int iIntValue = numArr[Math.abs(strHI.hashCode() / 2) % 6].intValue();
                ((C1460m) this.f1362n).gh.setVisibility(4);
                ((C1460m) this.f1362n).J2.setVisibility(0);
                ((C1460m) this.f1362n).J2.setImageResource(iIntValue);
            } else if (Build.VERSION.SDK_INT >= 29) {
                ((C1460m) this.f1362n).J2.setVisibility(0);
                ((C1460m) this.f1362n).J2.setTag(Long.valueOf(info.Z()));
                ((C1460m) this.f1362n).gh.setVisibility(4);
                HI0.qz.t(j.HI, new Function0() { // from class: D5a.n
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return j.n.qie(this.f1374n, info);
                    }
                }).Uo(new Function1() { // from class: D5a.w6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return j.n.ty(this.f1394n, info, (Bitmap) obj);
                    }
                });
            } else {
                ((C1460m) this.f1362n).J2.setVisibility(4);
                ((C1460m) this.f1362n).gh.setVisibility(0);
                SimpleDraweeView simpleDraweeView = ((C1460m) this.f1362n).gh;
                String strNr = info.nr();
                Intrinsics.checkNotNull(strNr);
                ImageRequestBuilder imageRequestBuilderAYN = ImageRequestBuilder.aYN(Uri.fromFile(new File(strNr)));
                imageRequestBuilderAYN.X(true);
                imageRequestBuilderAYN.v(new dX.CN3(100, 100, 0.0f, 0.0f, 12, null));
                simpleDraweeView.setImageRequest(imageRequestBuilderAYN.n());
            }
            if (this.rl.HI() != Dsr.f1304r || this.rl.ty() == j.EnumC0648j.f45855n) {
                ((C1460m) this.f1362n).nr.setText(String.valueOf(info.aYN()));
                ((C1460m) this.f1362n).f9525t.setText(String.valueOf(info.J2()));
                ((C1460m) this.f1362n).xMQ.setVisibility(0);
                ((C1460m) this.f1362n).xMQ.setText(TimeKt.formatTimeMillis$default((int) info.ck(), "hhh:mm:ss:ttt", false, 4, null));
                if (Intrinsics.areEqual(info.nY(), this.rl.XQ())) {
                    ((C1460m) this.f1362n).KN.setVisibility(0);
                    ((C1460m) this.f1362n).KN.setTotalDuration(this.rl.S());
                    ((C1460m) this.f1362n).KN.setCurrentDuration(this.rl.ck());
                    ((C1460m) this.f1362n).Uo.setImageResource(this.rl.WPU() ? 2131231866 : 2131231879);
                } else {
                    ((C1460m) this.f1362n).KN.setVisibility(4);
                    ((C1460m) this.f1362n).Uo.setImageResource(2131231879);
                }
                ImageButton imageButton = ((C1460m) this.f1362n).Uo;
                final j jVar = this.rl;
                imageButton.setOnClickListener(new View.OnClickListener() { // from class: D5a.I28
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j.n.ck(jVar, info, view);
                    }
                });
                ImageButton imageButton2 = ((C1460m) this.f1362n).rl;
                final j jVar2 = this.rl;
                imageButton2.setOnClickListener(new View.OnClickListener() { // from class: D5a.Wre
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        j.n.Ik(jVar2, info, view);
                    }
                });
                ImageButton imageButton3 = ((C1460m) this.f1362n).rl;
                final j jVar3 = this.rl;
                imageButton3.setOnLongClickListener(new View.OnLongClickListener() { // from class: D5a.CN3
                    @Override // android.view.View.OnLongClickListener
                    public final boolean onLongClick(View view) {
                        return j.n.r(jVar3, info, view);
                    }
                });
                return;
            }
            ((C1460m) this.f1362n).xMQ.setVisibility(4);
            ((C1460m) this.f1362n).KN.setVisibility(4);
            ((C1460m) this.f1362n).f9523O.setVisibility(4);
            ((C1460m) this.f1362n).Uo.setVisibility(4);
            ((C1460m) this.f1362n).rl.setVisibility(4);
            AppCompatTextView appCompatTextView = ((C1460m) this.f1362n).nr;
            int i2 = C0048j.$EnumSwitchMapping$0[this.rl.ty().ordinal()];
            String str = "";
            if (i2 == 1 ? (strT = info.t()) != null : i2 == 2 ? (strT = info.J2()) != null : i2 == 3 && (strT = info.r()) != null) {
                str = strT;
            }
            appCompatTextView.setText(str);
            ((C1460m) this.f1362n).f9525t.setTextColor(this.itemView.getResources().getColor(2131099755, null));
            ((C1460m) this.f1362n).f9525t.setText(String.valueOf(info.xMQ()));
            View view = this.itemView;
            final j jVar4 = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: D5a.Ml
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    j.n.HI(jVar4, info, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void HI(j jVar, tu.Z z2, View view) {
            jVar.Ik().invoke(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(j jVar, tu.Z z2, View view) {
            jVar.Ik().invoke(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ck(j jVar, tu.Z z2, View view) {
            jVar.o().invoke(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean r(j jVar, tu.Z z2, View view) {
            return ((Boolean) jVar.r().invoke(z2)).booleanValue();
        }
    }

    public /* synthetic */ class w6 {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[tu.Ew.values().length];
            try {
                iArr[tu.Ew.J2.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tu.Ew.f73884r.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[tu.Ew.f73883o.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[tu.Ew.f73880Z.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public j(List mediaList, Uri uri, j.EnumC0648j audioBrowserMode, Dsr bucketMode, Function1 onItemClicked, Function1 onItemPlayPauseClicked, Function1 onItemLongClicked) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(audioBrowserMode, "audioBrowserMode");
        Intrinsics.checkNotNullParameter(bucketMode, "bucketMode");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onItemPlayPauseClicked, "onItemPlayPauseClicked");
        Intrinsics.checkNotNullParameter(onItemLongClicked, "onItemLongClicked");
        this.f1359n = mediaList;
        this.rl = audioBrowserMode;
        this.f1360t = bucketMode;
        this.nr = onItemClicked;
        this.f1358O = onItemPlayPauseClicked;
        this.J2 = onItemLongClicked;
        Delegates delegates = Delegates.INSTANCE;
        this.Uo = new Ml(uri, this);
        this.KN = -1;
    }

    public final Dsr HI() {
        return this.f1360t;
    }

    public final Function1 Ik() {
        return this.nr;
    }

    public final int S() {
        return this.mUb;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: ViF, reason: merged with bridge method [inline-methods] */
    public n onCreateViewHolder(ViewGroup parent, int i2) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 != 2131558492) {
            throw new UnsupportedOperationException();
        }
        C1460m c1460mT = C1460m.t(LayoutInflater.from(parent.getContext()), parent, false);
        Intrinsics.checkNotNull(c1460mT);
        return new n(this, c1460mT);
    }

    public final boolean WPU() {
        return this.xMQ;
    }

    public final Uri XQ() {
        return (Uri) this.Uo.getValue(this, az[0]);
    }

    public final int Z() {
        return this.KN;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: aYN, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(n holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        holder.gh((tu.Z) this.f1359n.get(i2));
    }

    public final int ck() {
        return this.gh;
    }

    public final void fD(int i2) {
        this.mUb = i2;
    }

    public final void g(boolean z2) {
        this.xMQ = z2;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f1359n.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        int i3 = w6.$EnumSwitchMapping$0[((tu.Z) this.f1359n.get(i2)).ViF().ordinal()];
        if (i3 == 1 || i3 == 2) {
            throw new NotImplementedError(null, 1, null);
        }
        if (i3 == 3 || i3 == 4) {
            return 2131558492;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void iF(Uri uri) {
        this.Uo.setValue(this, az[0], uri);
    }

    public final Function1 o() {
        return this.f1358O;
    }

    public final Function1 r() {
        return this.J2;
    }

    public final void te(int i2) {
        this.KN = i2;
    }

    public final j.EnumC0648j ty() {
        return this.rl;
    }

    public final void nY(int i2) {
        int i3;
        if (XQ() != null && (i3 = this.KN) != -1) {
            this.gh = i2;
            notifyItemChanged(i3);
        }
    }
}
