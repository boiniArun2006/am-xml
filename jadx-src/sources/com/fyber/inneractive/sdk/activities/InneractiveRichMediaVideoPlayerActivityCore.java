package com.fyber.inneractive.sdk.activities;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.widget.VideoView;
import com.fyber.inneractive.sdk.R;
import com.fyber.inneractive.sdk.util.IAlog;
import com.safedk.android.analytics.brandsafety.BrandSafetyUtils;
import com.safedk.android.analytics.brandsafety.DetectTouchUtils;
import com.safedk.android.internal.partials.DTExchangeVideoBridge;
import com.safedk.android.utils.Logger;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes7.dex */
public class InneractiveRichMediaVideoPlayerActivityCore extends Activity {
    public static final String VIDEO_CURRENT_POSITION = "video_current_position";
    public static final String VIDEO_URL = "video_url";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public VideoView f53085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f53086b = 0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final n f53087c = new n(this);

    public static void safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(Context p0, Intent p1) {
        Logger.d("SafeDK-Special|SafeDK: Call> Landroid/content/Context;->startActivity(Landroid/content/Intent;)V");
        if (p1 == null) {
            return;
        }
        BrandSafetyUtils.detectAdClick(p1, com.safedk.android.utils.h.f63176p);
        p0.startActivity(p1);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent me) {
        DetectTouchUtils.activityOnTouch(com.safedk.android.utils.h.f63176p, me);
        return super.dispatchTouchEvent(me);
    }

    public void initWindowFeatures() {
        requestWindowFeature(1);
        getWindow().addFlags(1024);
        getWindow().addFlags(128);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        initWindowFeatures();
        super.onCreate(bundle);
        if (bundle != null) {
            this.f53086b = bundle.getInt(VIDEO_CURRENT_POSITION, 0);
        }
        setContentView(R.layout.ia_layout_rich_media_video);
        this.f53085a = (VideoView) findViewById(R.id.mraid_video_view);
        Intent intent = getIntent();
        String stringExtra = (intent == null || !intent.hasExtra("video_url")) ? null : intent.getStringExtra("video_url");
        if (TextUtils.isEmpty(stringExtra)) {
            IAlog.a("Error: video can not be played.", new Object[0]);
            finish();
        } else {
            this.f53085a.setVideoPath(stringExtra);
            this.f53085a.setOnCompletionListener(new p(this));
            this.f53085a.setOnErrorListener(new q(this));
            this.f53085a.setOnPreparedListener(this.f53087c);
        }
        findViewById(R.id.ia_iv_close_button).setOnClickListener(new o(this));
    }

    public static boolean startRichMediaIntent(Context context, String str) {
        Intent intent = new Intent(context, (Class<?>) InneractiveRichMediaVideoPlayerActivityCore.class);
        intent.setFlags(268435456);
        intent.putExtra("video_url", str);
        try {
            safedk_Context_startActivity_97cb3195734cf5c9cc3418feeafa6dd6(context, intent);
            return true;
        } catch (Exception unused) {
            IAlog.a("Activity InneractiveRichMediaVideoPlayerActivityCore was not found. Did you declare it in your AndroidManifest.xml?", new Object[0]);
            return false;
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.f53086b = this.f53085a.getCurrentPosition();
        DTExchangeVideoBridge.VideoViewPause(this.f53085a);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle bundle) {
        int currentPosition;
        super.onSaveInstanceState(bundle);
        VideoView videoView = this.f53085a;
        if (videoView == null) {
            currentPosition = 0;
        } else {
            currentPosition = videoView.getCurrentPosition();
        }
        bundle.putInt(VIDEO_CURRENT_POSITION, currentPosition);
    }
}
