package yc;

import HI0.AsyncTaskC1374z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.media3.extractor.text.ttml.TtmlNode;
import androidx.palette.graphics.Palette;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.project.ProjectInfo;
import com.alightcreative.app.motion.scene.BitmapLruCache;
import com.alightcreative.app.motion.scene.ColorKt;
import com.alightcreative.app.motion.scene.Scene;
import com.alightcreative.app.motion.scene.SceneKt;
import com.alightcreative.app.motion.scene.SceneThumbnailMaker;
import com.alightcreative.app.motion.scene.SceneType;
import com.alightcreative.app.motion.scene.SolidColor;
import com.alightcreative.app.motion.scene.TimeKt;
import com.alightcreative.app.motion.scene.serializer.MalformedSceneException;
import com.alightcreative.app.motion.scene.serializer.SceneSerializerKt;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.io.CloseableKt;
import kotlin.io.FilesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import qcD.nehv.Apsps;
import yc.Pl;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
public final class Pl extends RecyclerView.Adapter {
    public static final j az = new j(null);
    public static final int ty = 8;
    private final Function0 J2;
    private final Function0 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function1 f75827O;
    private final Integer Uo;
    private final Paint gh;
    private int mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final HI0.Q f75828n;
    private final SceneThumbnailMaker nr;
    private final int qie;
    private final List rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final BitmapLruCache f75829t;
    private int xMQ;

    public static final class j {
        public /* synthetic */ j(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private j() {
        }
    }

    /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
    public final class n extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f75830n;
        final /* synthetic */ Pl rl;

        /* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
        public /* synthetic */ class j {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[SceneType.values().length];
                try {
                    iArr[SceneType.SCENE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SceneType.ELEMENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[SceneType.PRESET.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Pl pl, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = pl;
            this.f75830n = itemBinding;
        }

        private static final void gh(ImageView imageView, n nVar, Pl pl, Bitmap bitmap) {
            Palette.Swatch swatchXMQ;
            int i2;
            int iO;
            Palette paletteN = Palette.rl(bitmap).n();
            Intrinsics.checkNotNullExpressionValue(paletteN, "generate(...)");
            boolean z2 = true;
            if (paletteN.KN() != null && r3.t()[2] <= 0.5d) {
                z2 = false;
            }
            if (z2) {
                swatchXMQ = paletteN.J2();
                if (swatchXMQ == null && (swatchXMQ = paletteN.xMQ()) == null && (swatchXMQ = paletteN.mUb()) == null && (swatchXMQ = paletteN.qie()) == null && (swatchXMQ = paletteN.Uo()) == null) {
                    swatchXMQ = paletteN.KN();
                }
            } else {
                swatchXMQ = paletteN.xMQ();
                if (swatchXMQ == null && (swatchXMQ = paletteN.J2()) == null && (swatchXMQ = paletteN.Uo()) == null && (swatchXMQ = paletteN.qie()) == null && (swatchXMQ = paletteN.mUb()) == null) {
                    swatchXMQ = paletteN.KN();
                }
            }
            int iO2 = swatchXMQ != null ? swatchXMQ.O() : z2 ? -12303292 : -6710887;
            imageView.setBackgroundColor(ColorKt.toInt(ColorKt.atop(HI0.qf.t(1073741823 & iO2), SolidColor.INSTANCE.getWHITE())));
            ((SJ0.U) nVar.f75830n).f9357t.setTextColor(-1);
            ((SJ0.U) nVar.f75830n).nr.setTextColor(-1);
            if (z2) {
                Palette.Swatch swatchJ2 = paletteN.J2();
                if (swatchJ2 != null) {
                    iO = swatchJ2.O();
                    i2 = iO & 1610612735;
                } else {
                    i2 = pl.xMQ;
                }
            } else {
                Palette.Swatch swatchXMQ2 = paletteN.xMQ();
                if (swatchXMQ2 != null) {
                    iO = swatchXMQ2.O();
                    i2 = iO & 1610612735;
                } else {
                    i2 = pl.mUb;
                }
            }
            ((SJ0.U) nVar.f75830n).f9355O.setBackgroundColor(i2);
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmap.getWidth(), bitmap.getHeight(), Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            Canvas canvas = new Canvas(bitmapCreateBitmap);
            float fMax = Math.max(bitmap.getWidth(), bitmap.getHeight()) / 20.0f;
            int iCeil = (int) Math.ceil(r2 / fMax);
            int iCeil2 = (int) Math.ceil(r7 / fMax);
            pl.gh.setStyle(Paint.Style.FILL);
            int i3 = iO2 & 536870911;
            int i5 = iO2 & 805306367;
            for (int i7 = 0; i7 < iCeil2; i7++) {
                float f3 = i7 * fMax;
                for (int i8 = 0; i8 < iCeil; i8++) {
                    float f4 = i8 * fMax;
                    pl.gh.setColor(((i7 % 2) + i8) % 2 == 0 ? i3 : i5);
                    canvas.drawRect(f4, f3, f4 + fMax, f3 + fMax, pl.gh);
                }
            }
            canvas.drawBitmap(bitmap, 0.0f, 0.0f, (Paint) null);
            imageView.setImageBitmap(bitmapCreateBitmap);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit mUb(Pl pl, ProjectInfo.n nVar, ImageView imageView, n nVar2, Bitmap bitmap) {
            if (bitmap != null) {
                pl.r().put(nVar, bitmap);
                if (Intrinsics.areEqual(imageView.getTag(), nVar.getId())) {
                    gh(imageView, nVar2, pl, bitmap);
                }
                return Unit.INSTANCE;
            }
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
            Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
            new Canvas(bitmapCreateBitmap).drawColor(-65536);
            pl.r().put(nVar, bitmapCreateBitmap);
            if (Intrinsics.areEqual(imageView.getTag(), nVar.getId())) {
                gh(imageView, nVar2, pl, bitmapCreateBitmap);
            }
            return Unit.INSTANCE;
        }

        public final void Uo(final ProjectInfo.n project) {
            String str;
            String str2;
            Intrinsics.checkNotNullParameter(project, "project");
            ViewBinding viewBinding = this.f75830n;
            Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.ListitemAddpopElementListBinding");
            int iFrameNumberFromTime = TimeKt.frameNumberFromTime(project.getDuration(), project.getFphs());
            ((SJ0.U) this.f75830n).nr.setText(project.getTitle());
            if ((project.getHeight() * 16) / 9 == project.getWidth()) {
                str = project.getHeight() + TtmlNode.TAG_P;
                str2 = " 16:9";
            } else if ((project.getHeight() * 9) / 16 == project.getWidth()) {
                str = project.getWidth() + TtmlNode.TAG_P;
                str2 = " 9:16";
            } else if ((project.getHeight() * 4) / 3 == project.getWidth()) {
                str = project.getHeight() + TtmlNode.TAG_P;
                str2 = " 4:3";
            } else if (project.getWidth() == project.getHeight()) {
                str = project.getWidth() + TtmlNode.TAG_P;
                str2 = " 1:1";
            } else {
                str = project.getWidth() + "x" + project.getHeight();
                str2 = "";
            }
            ((SJ0.U) this.f75830n).f9357t.setText(TimeKt.formatFrameNumber(iFrameNumberFromTime, project.getFphs(), "hh:mm:ss") + " — " + str + " " + TimeKt.formatFPS(project.getFphs()) + "fps" + str2);
            final ImageView thumbnail = ((SJ0.U) this.f75830n).J2;
            Intrinsics.checkNotNullExpressionValue(thumbnail, "thumbnail");
            thumbnail.setTag(project.getId());
            Context context = thumbnail.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            final File fileO = HI0.afx.o(context, project.getId());
            View view = this.itemView;
            final Pl pl = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: yc.Xo
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    Pl.n.KN(pl, project, view2);
                }
            });
            Bitmap bitmap = this.rl.r().get(project);
            if (bitmap != null) {
                gh(thumbnail, this, this.rl, bitmap);
                return;
            }
            thumbnail.setImageBitmap(null);
            File cacheDir = IvA.n.rl().getApplicationContext().getCacheDir();
            Intrinsics.checkNotNullExpressionValue(cacheDir, "getCacheDir(...)");
            final File fileResolve = FilesKt.resolve(cacheDir, Apsps.xFCfOBNcmNzUU);
            final Pl pl3 = this.rl;
            AsyncTaskC1374z asyncTaskC1374zNr = HI0.qz.nr(null, new Function0() { // from class: yc.eO
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Pl.n.xMQ(fileResolve, project, fileO, pl3);
                }
            }, 1, null);
            final Pl pl4 = this.rl;
            asyncTaskC1374zNr.Uo(new Function1() { // from class: yc.z
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return Pl.n.mUb(pl4, project, thumbnail, this, (Bitmap) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void KN(Pl pl, ProjectInfo.n nVar, View view) {
            pl.Ik().invoke(nVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap xMQ(File file, ProjectInfo.n nVar, File file2, Pl pl) {
            String str;
            file.mkdirs();
            String id = nVar.getId();
            long lastModified = nVar.getLastModified();
            if (nVar.getType() == SceneType.ELEMENT) {
                str = "png";
            } else {
                str = "jpg";
            }
            File fileResolve = FilesKt.resolve(file, id + "_" + lastModified + "." + str);
            if (fileResolve.exists()) {
                FileInputStream fileInputStream = new FileInputStream(fileResolve);
                try {
                    Bitmap bitmapDecodeStream = BitmapFactory.decodeStream(fileInputStream);
                    CloseableKt.closeFinally(fileInputStream, null);
                    return bitmapDecodeStream;
                } catch (Throwable th) {
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        CloseableKt.closeFinally(fileInputStream, th);
                        throw th2;
                    }
                }
            }
            try {
                Scene sceneUnserializeScene$default = SceneSerializerKt.unserializeScene$default(FilesKt.readText$default(file2, null, 1, null), false, false, false, 14, null);
                Bitmap bitmapMakeThumbnail$default = SceneThumbnailMaker.makeThumbnail$default(pl.o(), sceneUnserializeScene$default, null, Integer.valueOf(SceneKt.getThumbTime(sceneUnserializeScene$default)), false, 2, null);
                FileOutputStream fileOutputStream = new FileOutputStream(fileResolve);
                try {
                    int i2 = j.$EnumSwitchMapping$0[nVar.getType().ordinal()];
                    if (i2 != 1) {
                        if (i2 != 2) {
                            if (i2 == 3) {
                                bitmapMakeThumbnail$default.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                            } else {
                                throw new NoWhenBranchMatchedException();
                            }
                        } else {
                            bitmapMakeThumbnail$default.compress(Bitmap.CompressFormat.PNG, 80, fileOutputStream);
                        }
                    } else {
                        bitmapMakeThumbnail$default.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                    }
                    CloseableKt.closeFinally(fileOutputStream, null);
                    return bitmapMakeThumbnail$default;
                } finally {
                }
            } catch (MalformedSceneException unused) {
                Bitmap bitmapCreateBitmap = Bitmap.createBitmap(256, 256, Bitmap.Config.ARGB_8888);
                Intrinsics.checkNotNullExpressionValue(bitmapCreateBitmap, "createBitmap(...)");
                new Canvas(bitmapCreateBitmap).drawColor(-65536);
                return bitmapCreateBitmap;
            }
        }
    }

    public Pl(HI0.Q contentResolver, List projectList, BitmapLruCache thumbnailCache, SceneThumbnailMaker thumbnailMaker, Function1 onProjectClicked, Function0 onViewAllClicked, Integer num, Function0 function0) {
        Intrinsics.checkNotNullParameter(contentResolver, "contentResolver");
        Intrinsics.checkNotNullParameter(projectList, "projectList");
        Intrinsics.checkNotNullParameter(thumbnailCache, "thumbnailCache");
        Intrinsics.checkNotNullParameter(thumbnailMaker, "thumbnailMaker");
        Intrinsics.checkNotNullParameter(onProjectClicked, "onProjectClicked");
        Intrinsics.checkNotNullParameter(onViewAllClicked, "onViewAllClicked");
        this.f75828n = contentResolver;
        this.rl = projectList;
        this.f75829t = thumbnailCache;
        this.nr = thumbnailMaker;
        this.f75827O = onProjectClicked;
        this.J2 = onViewAllClicked;
        this.Uo = num;
        this.KN = function0;
        Context contextRl = contentResolver.rl();
        Intrinsics.checkNotNull(contextRl);
        this.xMQ = contextRl.getResources().getColor(2131099865, null);
        Context contextRl2 = contentResolver.rl();
        Intrinsics.checkNotNull(contextRl2);
        this.mUb = contextRl2.getResources().getColor(2131099867, null);
        this.gh = new Paint();
        this.qie = num == null ? 1 : 2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void XQ(Pl pl, View view) {
        pl.J2.invoke();
    }

    public final Function1 Ik() {
        return this.f75827O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: WPU, reason: merged with bridge method [inline-methods] */
    public n onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 == 2131558667) {
            viewBindingT = SJ0.U.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        } else if (i2 != 2131558722) {
            switch (i2) {
                case 2131558717:
                    viewBindingT = SJ0.rfW.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558718:
                    viewBindingT = SJ0.tmw.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                case 2131558719:
                    viewBindingT = SJ0.tpM.t(LayoutInflater.from(parent.getContext()), parent, false);
                    Intrinsics.checkNotNull(viewBindingT);
                    break;
                default:
                    throw new UnsupportedOperationException();
            }
        } else {
            viewBindingT = SJ0.ys8.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        }
        return new n(this, viewBindingT);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(n holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        if (i2 == 0) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: yc.o
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Pl.XQ(this.f76074n, view);
                }
            });
            return;
        }
        if (i2 != 1) {
            holder.Uo((ProjectInfo.n) this.rl.get(i2 - this.qie));
            return;
        }
        if (this.Uo == null) {
            holder.Uo((ProjectInfo.n) this.rl.get(i2 - this.qie));
            return;
        }
        final Function0 function0 = this.KN;
        if (function0 != null) {
            holder.itemView.setOnClickListener(new View.OnClickListener() { // from class: yc.qz
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Pl.S(function0, view);
                }
            });
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.rl.size() + this.qie;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        Integer num;
        if (i2 == 0) {
            return 2131558722;
        }
        if (i2 == 1 && (num = this.Uo) != null) {
            return num.intValue();
        }
        return 2131558667;
    }

    public final SceneThumbnailMaker o() {
        return this.nr;
    }

    public final BitmapLruCache r() {
        return this.f75829t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(Function0 function0, View view) {
        function0.invoke();
    }
}
