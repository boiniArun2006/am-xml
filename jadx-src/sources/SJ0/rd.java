package SJ0;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.alightcreative.widget.AudioThumbnailView;
import com.alightcreative.widget.KeyframeView;
import com.alightcreative.widget.ThumbnailView;
import com.alightcreative.widget.TimelineBackgroundView;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes5.dex */
public final class rd implements ViewBinding {
    public final TextView J2;
    public final TimelineBackgroundView KN;

    /* JADX INFO: renamed from: O, reason: collision with root package name */
    public final KeyframeView f9621O;
    public final ThumbnailView Uo;
    public final ImageView mUb;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final ConstraintLayout f9622n;
    public final CardView nr;
    public final AudioThumbnailView rl;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final TextView f9623t;
    public final ImageView xMQ;

    @Override // androidx.viewbinding.ViewBinding
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public ConstraintLayout getRoot() {
        return this.f9622n;
    }

    private rd(ConstraintLayout constraintLayout, AudioThumbnailView audioThumbnailView, TextView textView, CardView cardView, KeyframeView keyframeView, TextView textView2, ThumbnailView thumbnailView, TimelineBackgroundView timelineBackgroundView, ImageView imageView, ImageView imageView2) {
        this.f9622n = constraintLayout;
        this.rl = audioThumbnailView;
        this.f9623t = textView;
        this.nr = cardView;
        this.f9621O = keyframeView;
        this.J2 = textView2;
        this.Uo = thumbnailView;
        this.KN = timelineBackgroundView;
        this.xMQ = imageView;
        this.mUb = imageView2;
    }

    public static rd n(View view) {
        int i2 = 2131362120;
        AudioThumbnailView audioThumbnailView = (AudioThumbnailView) ViewBindings.n(view, 2131362120);
        if (audioThumbnailView != null) {
            i2 = 2131362371;
            TextView textView = (TextView) ViewBindings.n(view, 2131362371);
            if (textView != null) {
                i2 = 2131362651;
                CardView cardView = (CardView) ViewBindings.n(view, 2131362651);
                if (cardView != null) {
                    i2 = 2131362653;
                    KeyframeView keyframeView = (KeyframeView) ViewBindings.n(view, 2131362653);
                    if (keyframeView != null) {
                        i2 = 2131362654;
                        TextView textView2 = (TextView) ViewBindings.n(view, 2131362654);
                        if (textView2 != null) {
                            i2 = 2131362660;
                            ThumbnailView thumbnailView = (ThumbnailView) ViewBindings.n(view, 2131362660);
                            if (thumbnailView != null) {
                                i2 = 2131363899;
                                TimelineBackgroundView timelineBackgroundView = (TimelineBackgroundView) ViewBindings.n(view, 2131363899);
                                if (timelineBackgroundView != null) {
                                    i2 = 2131363955;
                                    ImageView imageView = (ImageView) ViewBindings.n(view, 2131363955);
                                    if (imageView != null) {
                                        i2 = 2131363956;
                                        ImageView imageView2 = (ImageView) ViewBindings.n(view, 2131363956);
                                        if (imageView2 != null) {
                                            return new rd((ConstraintLayout) view, audioThumbnailView, textView, cardView, keyframeView, textView2, thumbnailView, timelineBackgroundView, imageView, imageView2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i2)));
    }

    public static rd t(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z2) {
        View viewInflate = layoutInflater.inflate(2131558832, viewGroup, false);
        if (z2) {
            viewGroup.addView(viewInflate);
        }
        return n(viewInflate);
    }
}
