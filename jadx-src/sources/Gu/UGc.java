package Gu;

import SJ0.iy;
import android.media.MediaPlayer;
import android.net.Uri;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes4.dex */
public final class UGc extends RecyclerView.ViewHolder {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final iy f3769n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UGc(iy itemBinding) {
        super(itemBinding.getRoot());
        Intrinsics.checkNotNullParameter(itemBinding, "itemBinding");
        this.f3769n = itemBinding;
    }

    public final void O(l3D info, String str) {
        Intrinsics.checkNotNullParameter(info, "info");
        Integer numN = info.n();
        if (numN != null) {
            this.f3769n.nr.setBackgroundColor(numN.intValue());
        }
        String strO = info.O();
        if (strO != null) {
            this.f3769n.f9491O.setText(strO);
        } else {
            this.f3769n.f9491O.setVisibility(8);
        }
        this.f3769n.f9493t.setText(info.t());
        String strRl = info.rl();
        if (strRl != null) {
            this.f3769n.rl.setText(strRl);
        } else {
            this.f3769n.rl.setVisibility(8);
        }
        if (str == null) {
            this.f3769n.J2.setVisibility(8);
            return;
        }
        this.f3769n.J2.setVideoURI(Uri.parse(str));
        this.f3769n.J2.requestFocus();
        this.f3769n.J2.setOnPreparedListener(new MediaPlayer.OnPreparedListener() { // from class: Gu.s4
            @Override // android.media.MediaPlayer.OnPreparedListener
            public final void onPrepared(MediaPlayer mediaPlayer) {
                UGc.J2(mediaPlayer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void J2(MediaPlayer mediaPlayer) {
        mediaPlayer.start();
        mediaPlayer.setLooping(true);
    }
}
