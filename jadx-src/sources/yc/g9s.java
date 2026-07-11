package yc;

import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.os.Build;
import android.util.Size;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import com.alightcreative.app.motion.scene.TimeKt;
import com.facebook.drawee.view.SimpleDraweeView;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import yc.g9s;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class g9s extends RecyclerView.Adapter {
    private final Function1 J2;
    private final Function0 KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    private final Function0 f75990O;
    private final boolean Uo;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private List f75991n;
    private final Function1 nr;
    private final int rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private String f75992t;

    public final class j extends RecyclerView.ViewHolder {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private final ViewBinding f75993n;
        final /* synthetic */ g9s rl;

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean S(j jVar, tu.Z z2, View view) {
            DateFormat dateInstance = DateFormat.getDateInstance(1);
            new AlertDialog.Builder(jVar.itemView.getContext()).setTitle(z2.aYN()).KN("Date Added: " + WPU(dateInstance, z2.gh()) + "\nDate Modified: " + WPU(dateInstance, z2.qie()) + "\nDate Taken: " + WPU(dateInstance, z2.az()) + "\nFolder: " + z2.Uo() + "\nDuration: " + TimeKt.formatTimeMillis$default((int) z2.ck(), "hhh:mm:ss.ttt", false, 4, null) + "\nDimensions: " + z2.g() + " x " + z2.o() + "\nSize: " + HI0.gnv.nr(z2.WPU()) + "\nType: " + z2.XQ() + "\nOrientation: " + z2.S()).setPositiveButton(2132017378, new DialogInterface.OnClickListener() { // from class: yc.ci
                @Override // android.content.DialogInterface.OnClickListener
                public final void onClick(DialogInterface dialogInterface, int i2) {
                    g9s.j.aYN(dialogInterface, i2);
                }
            }).create().show();
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void ck(g9s g9sVar, View view) {
            view.setActivated(true);
            Function1 function1HI = g9sVar.HI();
            Intrinsics.checkNotNull(view);
            function1HI.invoke(view);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Bitmap r(j jVar, tu.Z z2) {
            try {
                return jVar.itemView.getContext().getContentResolver().loadThumbnail(z2.nY(), new Size(200, 200), null);
            } catch (IOException e2) {
                XoT.C.mUb(jVar, new Function0() { // from class: yc.SPz
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.j.o(e2);
                    }
                });
                e2.printStackTrace();
                return null;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(g9s g9sVar, ViewBinding itemBinding) {
            super(itemBinding.getRoot());
            Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
            this.rl = g9sVar;
            this.f75993n = itemBinding;
        }

        private static final String WPU(DateFormat dateFormat, long j2) {
            if (j2 == 0) {
                return "(missing)";
            }
            if (j2 > 157680000000L) {
                String str = dateFormat.format(new Date(j2));
                Intrinsics.checkNotNullExpressionValue(str, "format(...)");
                return str;
            }
            if (j2 <= 0) {
                return String.valueOf(j2);
            }
            String str2 = dateFormat.format(new Date(j2 * 1000));
            Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
            return str2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit Z(j jVar, tu.Z z2, Bitmap bitmap) {
            if (bitmap != null && Intrinsics.areEqual(((SJ0.nKK) jVar.f75993n).Uo.getTag(), Long.valueOf(z2.Z()))) {
                ((SJ0.nKK) jVar.f75993n).Uo.setImageBitmap(bitmap);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final String o(IOException iOException) {
            return "loadThumbnail Error : " + iOException;
        }

        public final ViewBinding ViF() {
            return this.f75993n;
        }

        public final void az() {
            ViewBinding viewBinding = this.f75993n;
            if (!(viewBinding instanceof SJ0.jL)) {
                if (viewBinding instanceof SJ0.oJ) {
                    RelativeLayout root = ((SJ0.oJ) viewBinding).getRoot();
                    final g9s g9sVar = this.rl;
                    root.setOnClickListener(new View.OnClickListener() { // from class: yc.r
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            g9s.j.Ik(g9sVar, view);
                        }
                    });
                    return;
                }
                return;
            }
            LinearLayout linearLayout = ((SJ0.jL) viewBinding).f9505O;
            final g9s g9sVar2 = this.rl;
            linearLayout.setOnClickListener(new View.OnClickListener() { // from class: yc.UGc
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g9s.j.HI(g9sVar2, view);
                }
            });
            RelativeLayout relativeLayout = ((SJ0.jL) this.f75993n).nr;
            final g9s g9sVar3 = this.rl;
            relativeLayout.setOnClickListener(new View.OnClickListener() { // from class: yc.Q
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    g9s.j.ck(g9sVar3, view);
                }
            });
            if (((SJ0.jL) this.f75993n).nr.isActivated()) {
                ((SJ0.jL) this.f75993n).nr.setActivated(false);
            }
            AppCompatTextView appCompatTextView = ((SJ0.jL) this.f75993n).rl;
            String strQie = this.rl.qie();
            if (strQie == null) {
                strQie = this.itemView.getResources().getString(2132017237);
                Intrinsics.checkNotNullExpressionValue(strQie, "getString(...)");
            }
            appCompatTextView.setText(strQie);
        }

        public final void ty(final tu.Z info, int i2) {
            Intrinsics.checkNotNullParameter(info, "info");
            ViewBinding viewBinding = this.f75993n;
            Intrinsics.checkNotNull(viewBinding, "null cannot be cast to non-null type com.alightcreative.app.motion.databinding.AddMediaVisualmediaItemBinding");
            TextView duration = ((SJ0.nKK) this.f75993n).nr;
            Intrinsics.checkNotNullExpressionValue(duration, "duration");
            HI0.afx.ViF(duration, 2.0f, 0.0f, 0.0f, 1426063360);
            String scheme = info.nY().getScheme();
            kPg.fuX fux = kPg.fuX.f69922n;
            if (Intrinsics.areEqual(scheme, fux.rl())) {
                ((SJ0.nKK) this.f75993n).Uo.setVisibility(0);
                ((SJ0.nKK) this.f75993n).J2.setVisibility(8);
                ((SJ0.nKK) this.f75993n).Uo.setImageBitmap(fux.O(info.nY()));
            } else if (Build.VERSION.SDK_INT >= 29) {
                ((SJ0.nKK) this.f75993n).Uo.setVisibility(0);
                ((SJ0.nKK) this.f75993n).Uo.setTag(Long.valueOf(info.Z()));
                ((SJ0.nKK) this.f75993n).J2.setVisibility(8);
                HI0.qz.t(afx.f75917n, new Function0() { // from class: yc.QJ
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return g9s.j.r(this.f75836n, info);
                    }
                }).Uo(new Function1() { // from class: yc.l3D
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return g9s.j.Z(this.f76023n, info, (Bitmap) obj);
                    }
                });
            } else {
                ((SJ0.nKK) this.f75993n).Uo.setVisibility(8);
                ((SJ0.nKK) this.f75993n).J2.setVisibility(0);
                SimpleDraweeView simpleDraweeView = ((SJ0.nKK) this.f75993n).J2;
                ImageRequestBuilder imageRequestBuilderAYN = ImageRequestBuilder.aYN(info.nY());
                imageRequestBuilderAYN.X(true);
                imageRequestBuilderAYN.v(new dX.CN3(100, 100, 0.0f, 0.0f, 12, null));
                simpleDraweeView.setImageRequest(imageRequestBuilderAYN.n());
            }
            ((SJ0.nKK) this.f75993n).f9554O.setVisibility(i2 < this.rl.Ik() ? 0 : 4);
            TextView textView = ((SJ0.nKK) this.f75993n).rl;
            String strHI = info.HI();
            if (strHI == null) {
                strHI = "?";
            }
            textView.setText(strHI);
            ImageView imageView = ((SJ0.nKK) this.f75993n).KN;
            tu.Ew ewViF = info.ViF();
            tu.Ew ew = tu.Ew.f73884r;
            imageView.setVisibility(ewViF == ew ? 0 : 4);
            ((SJ0.nKK) this.f75993n).nr.setText((info.ViF() == ew || info.ViF() == tu.Ew.f73883o) ? TimeKt.formatTimeMillis$default((int) info.ck(), "hhh:mm:ss", false, 4, null) : "");
            View view = this.itemView;
            final g9s g9sVar = this.rl;
            view.setOnClickListener(new View.OnClickListener() { // from class: yc.c
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    g9s.j.XQ(g9sVar, info, view2);
                }
            });
            this.itemView.setOnLongClickListener(new View.OnLongClickListener() { // from class: yc.s4
                @Override // android.view.View.OnLongClickListener
                public final boolean onLongClick(View view2) {
                    return g9s.j.S(this.f76113n, info, view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void HI(g9s g9sVar, View view) {
            g9sVar.ck().invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void Ik(g9s g9sVar, View view) {
            g9sVar.ty().invoke();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void XQ(g9s g9sVar, tu.Z z2, View view) {
            g9sVar.az().invoke(z2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void aYN(DialogInterface dialogInterface, int i2) {
            dialogInterface.dismiss();
        }
    }

    public g9s(List mediaList, int i2, String str, Function1 onItemClicked, Function0 onViewAllClicked, Function1 onViewAlbumClicked, boolean z2, Function0 onManagePermissionsClicked) {
        Intrinsics.checkNotNullParameter(mediaList, "mediaList");
        Intrinsics.checkNotNullParameter(onItemClicked, "onItemClicked");
        Intrinsics.checkNotNullParameter(onViewAllClicked, "onViewAllClicked");
        Intrinsics.checkNotNullParameter(onViewAlbumClicked, "onViewAlbumClicked");
        Intrinsics.checkNotNullParameter(onManagePermissionsClicked, "onManagePermissionsClicked");
        this.f75991n = mediaList;
        this.rl = i2;
        this.f75992t = str;
        this.nr = onItemClicked;
        this.f75990O = onViewAllClicked;
        this.J2 = onViewAlbumClicked;
        this.Uo = z2;
        this.KN = onManagePermissionsClicked;
    }

    public final Function1 HI() {
        return this.J2;
    }

    public final int Ik() {
        return this.rl;
    }

    public final void Z(String str) {
        this.f75992t = str;
    }

    public final Function1 az() {
        return this.nr;
    }

    public final Function0 ck() {
        return this.f75990O;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemCount() {
        return this.f75991n.size() + 1;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public int getItemViewType(int i2) {
        if (i2 != 0) {
            return (i2 == 1 && this.Uo) ? 2131558721 : 2131558468;
        }
        return 2131558723;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public j onCreateViewHolder(ViewGroup parent, int i2) {
        ViewBinding viewBindingT;
        Intrinsics.checkNotNullParameter(parent, "parent");
        if (i2 == 2131558468) {
            viewBindingT = SJ0.nKK.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        } else if (i2 == 2131558721) {
            viewBindingT = SJ0.oJ.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        } else {
            if (i2 != 2131558723) {
                throw new UnsupportedOperationException();
            }
            viewBindingT = SJ0.jL.t(LayoutInflater.from(parent.getContext()), parent, false);
            Intrinsics.checkNotNull(viewBindingT);
        }
        return new j(this, viewBindingT);
    }

    public final String qie() {
        return this.f75992t;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(j holder, int i2) {
        Intrinsics.checkNotNullParameter(holder, "holder");
        ViewBinding viewBindingViF = holder.ViF();
        if ((viewBindingViF instanceof SJ0.jL) || (viewBindingViF instanceof SJ0.oJ)) {
            holder.az();
        } else {
            holder.ty((tu.Z) this.f75991n.get(i2 - (this.Uo ? 2 : 1)), i2);
        }
    }

    public final Function0 ty() {
        return this.KN;
    }
}
