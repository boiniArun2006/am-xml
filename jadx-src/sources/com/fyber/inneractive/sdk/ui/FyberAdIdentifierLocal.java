package com.fyber.inneractive.sdk.ui;

import aT.dE.JLZo;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.text.TextUtils;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.r;
import com.fyber.inneractive.sdk.network.w0;
import com.fyber.inneractive.sdk.ui.IFyberAdIdentifier;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.util.o;
import com.safedk.android.analytics.brandsafety.creatives.CreativeInfoManager;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes9.dex */
public class FyberAdIdentifierLocal extends IFyberAdIdentifier implements View.OnClickListener {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public ImageView f56938m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public TextView f56939n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f56940o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Animator f56941p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public float f56942q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public Bitmap f56943r;

    @Override // com.fyber.inneractive.sdk.ui.IFyberAdIdentifier
    public final void a(ViewGroup viewGroup) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(viewGroup.getContext());
        ViewGroup viewGroup2 = (ViewGroup) viewGroup.findViewById(R.id.ia_identifier_overlay);
        int i2 = 0;
        ViewGroup viewGroup3 = (ViewGroup) layoutInflaterFrom.inflate(R.layout.ia_layout_fyber_ad_identifier, viewGroup2, false);
        this.f56938m = (ImageView) viewGroup3.findViewById(R.id.ia_fyber_identifier_image);
        TextView textView = (TextView) viewGroup3.findViewById(R.id.ia_fyber_identifier_text);
        this.f56939n = textView;
        if (this.f56959j) {
            int i3 = this.f56951b;
            int i5 = this.f56952c;
            if (textView != null && textView.getLayoutParams() != null) {
                textView.getLayoutParams().width = o.b(i3);
                textView.getLayoutParams().height = o.b(i5);
            }
            ImageView imageView = this.f56938m;
            int i7 = this.f56953d;
            int i8 = this.f56954e;
            if (imageView != null && imageView.getLayoutParams() != null) {
                imageView.getLayoutParams().width = o.b(i7);
                imageView.getLayoutParams().height = o.b(i8);
            }
            TextView textView2 = this.f56939n;
            int i9 = this.f56955f;
            if (textView2 != null) {
                textView2.setTextSize(i9);
            }
            a(this.f56938m, this.f56956g);
            this.f56939n.setOnClickListener(this);
            this.f56939n.setText(this.f56957h);
            String str = this.f56958i;
            if (!TextUtils.isEmpty(str)) {
                IAConfigManager.f53260M.f53292r.a(new w0(new a(this), viewGroup2.getContext(), new com.fyber.inneractive.sdk.cache.b(str)));
            }
        }
        IFyberAdIdentifier.Corner corner = this.f56960k;
        if (corner == IFyberAdIdentifier.Corner.TOP_LEFT || corner == IFyberAdIdentifier.Corner.BOTTOM_LEFT) {
            viewGroup3.removeView(this.f56939n);
            viewGroup3.addView(this.f56939n);
            viewGroup3.setLayoutDirection(0);
        }
        viewGroup3.addOnLayoutChangeListener(new b(this));
        this.f56938m.setOnClickListener(this);
        a();
        viewGroup2.addView(viewGroup3);
        IFyberAdIdentifier.Corner corner2 = this.f56960k;
        corner2.getClass();
        int i10 = i.f56973a[corner2.ordinal()];
        if (i10 == 1) {
            i2 = 51;
        } else if (i10 == 2) {
            i2 = 53;
        } else if (i10 == 3) {
            i2 = 83;
        } else if (i10 == 4) {
            i2 = 85;
        }
        o.a(viewGroup3, i2);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Logger.d("DTExchange|SafeDK: Execution> Lcom/fyber/inneractive/sdk/ui/FyberAdIdentifierLocal;->onClick(Landroid/view/View;)V");
        CreativeInfoManager.onViewClicked(JLZo.ZmzuGSDAhtEGFAd, view);
        safedk_FyberAdIdentifierLocal_onClick_89450e1d2505e7faa72ce8c17442a8db(view);
    }

    public void safedk_FyberAdIdentifierLocal_onClick_89450e1d2505e7faa72ce8c17442a8db(View p0) {
        if (p0 != this.f56938m) {
            if (p0 == this.f56939n && this.f56961l == com.fyber.inneractive.sdk.config.global.features.a.OPEN) {
                a();
                IFyberAdIdentifier.ClickListener clickListener = this.f56950a;
                if (clickListener != null) {
                    clickListener.a();
                    return;
                }
                return;
            }
            return;
        }
        if (this.f56941p != null) {
            return;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        ImageView imageView = this.f56938m;
        Property property = View.ROTATION_X;
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 90.0f);
        ObjectAnimator objectAnimatorOfInt = ObjectAnimator.ofInt(this.f56938m, "imageAlpha", 255, 25);
        AnimatorSet animatorSet2 = new AnimatorSet();
        animatorSet2.playTogether(objectAnimatorOfFloat, objectAnimatorOfInt);
        animatorSet2.addListener(new c(this, animatorSet));
        animatorSet2.setDuration(225L);
        this.f56941p = animatorSet2;
        animatorSet2.start();
        ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(this.f56938m, (Property<ImageView, Float>) property, 0.0f);
        ObjectAnimator objectAnimatorOfInt2 = ObjectAnimator.ofInt(this.f56938m, "imageAlpha", 25, 255);
        AnimatorSet animatorSet3 = new AnimatorSet();
        animatorSet3.playTogether(objectAnimatorOfFloat2, objectAnimatorOfInt2);
        animatorSet3.setDuration(225L);
        ObjectAnimator objectAnimatorOfFloat3 = ObjectAnimator.ofFloat(this.f56939n, (Property<TextView, Float>) View.TRANSLATION_X, this.f56940o ? this.f56942q : 0.0f);
        objectAnimatorOfFloat3.setDuration(450L);
        animatorSet.setDuration(450L);
        animatorSet.playTogether(objectAnimatorOfFloat3, animatorSet3);
        animatorSet.addListener(new d(this));
    }

    public FyberAdIdentifierLocal(r rVar) {
        super(rVar);
        this.f56940o = false;
        this.f56942q = 0.0f;
    }

    public final void a() {
        this.f56940o = false;
        this.f56938m.setImageResource(R.drawable.ia_fyber_info_button);
        a(this.f56938m, this.f56956g);
        Animator animator = this.f56941p;
        if (animator != null) {
            animator.removeAllListeners();
            this.f56941p = null;
        }
    }

    public static void a(ImageView imageView, String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                com.fyber.inneractive.sdk.widget.a.a(imageView, ColorStateList.valueOf(Color.parseColor(str)));
                return;
            } catch (Exception unused) {
                IAlog.f("could not parse color %s", str);
                return;
            }
        }
        com.fyber.inneractive.sdk.widget.a.a(imageView, null);
    }
}
