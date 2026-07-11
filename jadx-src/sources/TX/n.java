package TX;

import SJ0.rrk;
import android.content.Context;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import androidx.compose.runtime.internal.StabilityInferred;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.alightcreative.app.motion.activities.main.newfeature.NewFeatureInfo;
import com.safedk.android.analytics.brandsafety.creatives.discoveries.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes3.dex */
@StabilityInferred
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0003J\u000f\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\"\u0010\u001c\u001a\u00020\u00158\u0006@\u0006X\u0086.¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001f\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"LTX/n;", "Landroidx/fragment/app/Fragment;", "<init>", "()V", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", TtmlNode.RUBY_CONTAINER, "Landroid/os/Bundle;", "savedInstanceState", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "g", "iF", "onDestroyView", "LSJ0/rrk;", c.f62177j, "LSJ0/rrk;", "_binding", "Lcom/alightcreative/app/motion/activities/main/newfeature/NewFeatureInfo;", "t", "Lcom/alightcreative/app/motion/activities/main/newfeature/NewFeatureInfo;", "ViF", "()Lcom/alightcreative/app/motion/activities/main/newfeature/NewFeatureInfo;", "te", "(Lcom/alightcreative/app/motion/activities/main/newfeature/NewFeatureInfo;)V", "info", "aYN", "()LSJ0/rrk;", "binding", "app_productionRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class n extends Fragment {

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private rrk _binding;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    public NewFeatureInfo info;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void nY(MediaPlayer mediaPlayer) {
        mediaPlayer.setLooping(true);
    }

    private final rrk aYN() {
        rrk rrkVar = this._binding;
        Intrinsics.checkNotNull(rrkVar);
        return rrkVar;
    }

    public final NewFeatureInfo ViF() {
        NewFeatureInfo newFeatureInfo = this.info;
        if (newFeatureInfo != null) {
            return newFeatureInfo;
        }
        Intrinsics.throwUninitializedPropertyAccessException("info");
        return null;
    }

    public final void g() {
        VideoView videoView;
        rrk rrkVar = this._binding;
        if (rrkVar == null || (videoView = rrkVar.J2) == null) {
            return;
        }
        videoView.pause();
    }

    public final void iF() {
        VideoView videoView;
        rrk rrkVar = this._binding;
        if (rrkVar == null || (videoView = rrkVar.J2) == null) {
            return;
        }
        videoView.start();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        this._binding = rrk.t(inflater, container, false);
        ConstraintLayout constraintLayoutRl = aYN().getRoot();
        Intrinsics.checkNotNullExpressionValue(constraintLayoutRl, "getRoot(...)");
        aYN().f9626O.setText(ViF().getTitle());
        aYN().f9628t.setText(ViF().getDesc());
        VideoView videoView = aYN().J2;
        Context context = getContext();
        String packageName = context != null ? context.getPackageName() : null;
        aYN().J2.setVideoURI(Uri.parse("android.resource://" + packageName + "/" + ViF().getResourceId()));
        aYN().J2.requestFocus();
        aYN().J2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: TX.j
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                n.nY(mediaPlayer);
            }
        });
        return constraintLayoutRl;
    }

    public final void te(NewFeatureInfo newFeatureInfo) {
        Intrinsics.checkNotNullParameter(newFeatureInfo, "<set-?>");
        this.info = newFeatureInfo;
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        VideoView videoView;
        super.onDestroyView();
        rrk rrkVar = this._binding;
        if (rrkVar != null && (videoView = rrkVar.J2) != null) {
            videoView.stopPlayback();
        }
        this._binding = null;
    }
}
