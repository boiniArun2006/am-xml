package yc;

import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.TimeKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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
import kotlin.text.StringsKt;
import yc.C;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
public final class C extends RecyclerView.Adapter {
    private final ReadWriteProperty J2;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f75704O;
    private final List Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f75705n;
    private final Function1 nr;
    private List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Function1 f75706t;
    static final /* synthetic */ KProperty[] xMQ = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(C.class, "playingUri", "getPlayingUri()Landroid/net/Uri;", 0))};
    public static final n KN = new n(null);
    public static final int mUb = 8;
    private static final ExecutorService gh = Executors.newSingleThreadExecutor();

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f75707n;
        final /* synthetic */ C rl;

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap HI(j jVar, tu.Z z2) {
            try {
                return jVar.itemView.getContext().getContentResolver().loadThumbnail(z2.nY(), new Size(200, 200), null);
            } catch (IOException e2) {
                XoT.C.mUb(jVar, new Function0() { // from class: yc.Dsr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C.j.ck(e2);
                    }
                });
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap r(j jVar, tu.Z z2) {
            try {
                return jVar.itemView.getContext().getContentResolver().loadThumbnail(z2.nY(), new Size(200, 200), null);
            } catch (IOException e2) {
                XoT.C.mUb(jVar, new Function0() { // from class: yc.aC
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C.j.o(e2);
                    }
                });
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(C c2, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = c2;
            this.f75707n = itemBinding;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Ik(ImageView imageView, tu.Z z2, Bitmap bitmap) {
            if (bitmap != null && Intrinsics.areEqual(imageView.getTag(), Long.valueOf(z2.Z()))) {
                imageView.setImageBitmap(bitmap);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Z(ImageView imageView, tu.Z z2, Bitmap bitmap) {
            if (bitmap != null && Intrinsics.areEqual(imageView.getTag(), Long.valueOf(z2.Z()))) {
                imageView.setImageBitmap(bitmap);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String ck(IOException iOException) {
            return "loadThumbnail Error : " + iOException;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(IOException iOException) {
            return "loadThumbnail Error : " + iOException;
        }

        public final ViewBinding XQ() {
            return this.f75707n;
        }

        public final void qie(final tu.Z info, TextView displayName, TextView duration, final ImageView placeholder, SimpleDraweeView thumbnail, ImageView playingIndicatorIcon, ImageView buttonAddAudioItem, View playingIndicatorBorder, View emptyPadding) {
            Intrinsics.checkNotNullParameter(info, "info");
            Intrinsics.checkNotNullParameter(displayName, "displayName");
            Intrinsics.checkNotNullParameter(duration, "duration");
            Intrinsics.checkNotNullParameter(placeholder, "placeholder");
            Intrinsics.checkNotNullParameter(thumbnail, "thumbnail");
            Intrinsics.checkNotNullParameter(playingIndicatorIcon, "playingIndicatorIcon");
            Intrinsics.checkNotNullParameter(buttonAddAudioItem, "buttonAddAudioItem");
            Intrinsics.checkNotNullParameter(playingIndicatorBorder, "playingIndicatorBorder");
            Intrinsics.checkNotNullParameter(emptyPadding, "emptyPadding");
            Iterator it = CollectionsKt.listOf((Object[]) new TextView[]{displayName, duration}).iterator();
            while (it.hasNext()) {
                HI0.afx.ViF((TextView) it.next(), 2.0f, 0.0f, 0.0f, 1426063360);
            }
            if (!this.rl.r().isEmpty() && this.rl.r().indexOf(info) == this.rl.r().size() - 1) {
                emptyPadding.setVisibility(0);
            }
            placeholder.setVisibility(4);
            thumbnail.setVisibility(0);
            if (info.ViF() == tu.Ew.f73883o) {
                if (info.nr() == null) {
                    placeholder.setVisibility(0);
                    thumbnail.setVisibility(4);
                    Integer[] numArr = {2131231208, 2131231209, 2131231210, 2131231211, 2131231212, 2131231213};
                    String strHI = info.HI();
                    if (strHI == null) {
                        strHI = String.valueOf(info.Z());
                    }
                    placeholder.setImageResource(numArr[Math.abs(strHI.hashCode() / 2) % 6].intValue());
                } else if (Build.VERSION.SDK_INT >= 29) {
                    placeholder.setVisibility(0);
                    placeholder.setTag(Long.valueOf(info.Z()));
                    thumbnail.setVisibility(8);
                    HI0.qz.t(C.gh, new Function0() { // from class: yc.w6
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return C.j.HI(this.f76150n, info);
                        }
                    }).Uo(new Function1() { // from class: yc.Ml
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return C.j.Ik(placeholder, info, (Bitmap) obj);
                        }
                    });
                } else {
                    String strNr = info.nr();
                    Intrinsics.checkNotNull(strNr);
                    ImageRequestBuilder imageRequestBuilderAYN = ImageRequestBuilder.aYN(Uri.fromFile(new File(strNr)));
                    imageRequestBuilderAYN.X(true);
                    imageRequestBuilderAYN.v(new dX.CN3(100, 100, 0.0f, 0.0f, 12, null));
                    thumbnail.setImageRequest(imageRequestBuilderAYN.n());
                }
            } else if (Build.VERSION.SDK_INT >= 29) {
                placeholder.setVisibility(0);
                placeholder.setTag(Long.valueOf(info.Z()));
                thumbnail.setVisibility(8);
                HI0.qz.t(C.gh, new Function0() { // from class: yc.I28
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return C.j.r(this.f75746n, info);
                    }
                }).Uo(new Function1() { // from class: yc.Wre
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return C.j.Z(placeholder, info, (Bitmap) obj);
                    }
                });
            } else {
                ImageRequestBuilder imageRequestBuilderAYN2 = ImageRequestBuilder.aYN(info.nY());
                imageRequestBuilderAYN2.X(true);
                imageRequestBuilderAYN2.v(new dX.CN3(100, 100, 0.0f, 0.0f, 12, null));
                thumbnail.setImageRequest(imageRequestBuilderAYN2.n());
            }
            if (Intrinsics.areEqual(info.nY(), this.rl.Ik())) {
                playingIndicatorIcon.setVisibility(0);
                playingIndicatorBorder.setVisibility(0);
            } else {
                playingIndicatorIcon.setVisibility(4);
                playingIndicatorBorder.setVisibility(4);
            }
            List<String> list = this.rl.Uo;
            String strHI2 = info.HI();
            if (strHI2 == null) {
                strHI2 = "?";
            }
            for (String str : list) {
                if (StringsKt.endsWith$default(strHI2, str, false, 2, (Object) null)) {
                    strHI2 = strHI2.substring(0, strHI2.length() - str.length());
                    Intrinsics.checkNotNullExpressionValue(strHI2, "substring(...)");
                }
            }
            displayName.setText(strHI2);
            duration.setText((info.ViF() == tu.Ew.f73884r || info.ViF() == tu.Ew.f73883o) ? TimeKt.formatTimeMillis$default((int) info.ck(), "hhh:mm:ss", false, 4, null) : "");
            View view = this.itemView;
            final C c2 = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: yc.CN3
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C.j.az(c2, info, view2);
                }
            });
            final C c4 = this.rl;
            buttonAddAudioItem.setOnClickListener(new View.OnClickListener() { // from class: yc.fuX
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    C.j.ty(c4, info, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void az(C c2, tu.Z z2, View view) {
            c2.ck().invoke(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ty(C c2, tu.Z z2, View view) {
            c2.HI().invoke(z2);
        }
    }

    public static final class n {
        public /* synthetic */ n(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private n() {
        }
    }

    public static final class w6 extends ObservableProperty {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ C f75708n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w6(Object obj, C c2) {
            super(obj);
            this.f75708n = c2;
        }

        @Override // kotlin.properties.ObservableProperty
        protected void afterChange(KProperty property, Object obj, Object obj2) {
            Intrinsics.checkNotNullParameter(property, "property");
            if (Intrinsics.areEqual((Uri) obj, (Uri) obj2)) {
                return;
            }
            this.f75708n.notifyDataSetChanged();
        }
    }

    public C(List mediaList, List recentlyUsedAudios, Uri uri, Function1 onItemAddClicked, Function1 onItemPlayPauseClicked, Function0 onViewAllClicked) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(recentlyUsedAudios, "recentlyUsedAudios");
        Intrinsics.checkNotNullParameter(onItemAddClicked, "onItemAddClicked");
        Intrinsics.checkNotNullParameter(onItemPlayPauseClicked, "onItemPlayPauseClicked");
        Intrinsics.checkNotNullParameter(onViewAllClicked, "onViewAllClicked");
        this.f75705n = mediaList;
        this.rl = recentlyUsedAudios;
        this.f75706t = onItemAddClicked;
        this.nr = onItemPlayPauseClicked;
        this.f75704O = onViewAllClicked;
        Delegates delegates = Delegates.INSTANCE;
        this.J2 = new w6(uri, this);
        this.Uo = CollectionsKt.listOf((Object[]) new String[]{".mp3", ".MP3", ".aac", ".AAC", ".m4a", ".M4A", ".mp4", ".MP4"});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Z(C c2, View view) {
        c2.f75704O.invoke();
    }

    public final Function1 HI() {
        return this.f75706t;
    }

    public final Uri Ik() {
        return (Uri) this.J2.getValue(this, xMQ[0]);
    }

    public final void S(Uri uri) {
        this.J2.setValue(this, xMQ[0], uri);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: XQ, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 == 2131558467) {
            viewBindingT = SJ0.Ew.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        } else if (i2 == 2131558722) {
            viewBindingT = SJ0.ys8.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        } else {
            if (i2 != 2131558814) {
                throw new UnsupportedOperationException();
            }
            viewBindingT = SJ0.giR.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        }
        return new j(this, viewBindingT);
    }

    public final Function1 ck() {
        return this.nr;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75705n.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        if (i2 <= 0) {
            return 2131558722;
        }
        int i3 = i2 - 1;
        return (i3 >= this.rl.size() || !this.rl.contains(this.f75705n.get(i3))) ? 2131558467 : 2131558814;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewBinding viewBindingXQ = holder.XQ();
        if (viewBindingXQ instanceof SJ0.Ew) {
            tu.Z z2 = (tu.Z) this.f75705n.get(i2 - 1);
            TextView displayName = ((SJ0.Ew) holder.XQ()).f9125t;
            Intrinsics.checkNotNullExpressionValue(displayName, "displayName");
            TextView duration = ((SJ0.Ew) holder.XQ()).nr;
            Intrinsics.checkNotNullExpressionValue(duration, "duration");
            AppCompatImageView placeholder = ((SJ0.Ew) holder.XQ()).Uo;
            Intrinsics.checkNotNullExpressionValue(placeholder, "placeholder");
            SimpleDraweeView thumbnail = ((SJ0.Ew) holder.XQ()).mUb;
            Intrinsics.checkNotNullExpressionValue(thumbnail, "thumbnail");
            ImageView playingIndicatorIcon = ((SJ0.Ew) holder.XQ()).xMQ;
            Intrinsics.checkNotNullExpressionValue(playingIndicatorIcon, "playingIndicatorIcon");
            ImageView buttonAddAudioItem = ((SJ0.Ew) holder.XQ()).rl;
            Intrinsics.checkNotNullExpressionValue(buttonAddAudioItem, "buttonAddAudioItem");
            View playingIndicatorBorder = ((SJ0.Ew) holder.XQ()).KN;
            Intrinsics.checkNotNullExpressionValue(playingIndicatorBorder, "playingIndicatorBorder");
            View emptyPadding = ((SJ0.Ew) holder.XQ()).f9123O;
            Intrinsics.checkNotNullExpressionValue(emptyPadding, "emptyPadding");
            holder.qie(z2, displayName, duration, placeholder, thumbnail, playingIndicatorIcon, buttonAddAudioItem, playingIndicatorBorder, emptyPadding);
            return;
        }
        if (!(viewBindingXQ instanceof SJ0.giR)) {
            if (!(viewBindingXQ instanceof SJ0.ys8)) {
                throw new UnsupportedOperationException();
            }
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: yc.j
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    C.Z(this.f76016n, view);
                }
            });
            return;
        }
        tu.Z z3 = (tu.Z) this.f75705n.get(i2 - 1);
        TextView displayName2 = ((SJ0.giR) holder.XQ()).f9460t;
        Intrinsics.checkNotNullExpressionValue(displayName2, "displayName");
        TextView duration2 = ((SJ0.giR) holder.XQ()).nr;
        Intrinsics.checkNotNullExpressionValue(duration2, "duration");
        ImageView placeholder2 = ((SJ0.giR) holder.XQ()).Uo;
        Intrinsics.checkNotNullExpressionValue(placeholder2, "placeholder");
        SimpleDraweeView thumbnail2 = ((SJ0.giR) holder.XQ()).gh;
        Intrinsics.checkNotNullExpressionValue(thumbnail2, "thumbnail");
        ImageView playingIndicatorIcon2 = ((SJ0.giR) holder.XQ()).xMQ;
        Intrinsics.checkNotNullExpressionValue(playingIndicatorIcon2, "playingIndicatorIcon");
        ImageView buttonAddAudioItem2 = ((SJ0.giR) holder.XQ()).rl;
        Intrinsics.checkNotNullExpressionValue(buttonAddAudioItem2, "buttonAddAudioItem");
        View playingIndicatorBorder2 = ((SJ0.giR) holder.XQ()).KN;
        Intrinsics.checkNotNullExpressionValue(playingIndicatorBorder2, "playingIndicatorBorder");
        View emptyPadding2 = ((SJ0.giR) holder.XQ()).f9458O;
        Intrinsics.checkNotNullExpressionValue(emptyPadding2, "emptyPadding");
        holder.qie(z3, displayName2, duration2, placeholder2, thumbnail2, playingIndicatorIcon2, buttonAddAudioItem2, playingIndicatorBorder2, emptyPadding2);
    }

    public final List r() {
        return this.rl;
    }
}
