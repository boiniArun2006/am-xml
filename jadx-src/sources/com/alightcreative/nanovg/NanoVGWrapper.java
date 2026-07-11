package com.alightcreative.nanovg;

import androidx.media3.exoplayer.upstream.CmcdData;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.fyber.inneractive.sdk.external.InneractiveMediationDefs;
import kotlin.Metadata;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b6\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\u000b\u0010\nJ0\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u0011\u0010\u0012J(\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u0017\u0010\u0016JH\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b\u001c\u0010\u001dJ8\u0010 \u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b \u0010!J\u0018\u0010\"\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b\"\u0010\nJ\u0018\u0010#\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b#\u0010\nJ\u0018\u0010$\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b$\u0010\nJ\u0018\u0010%\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b%\u0010\nJ\u0018\u0010&\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b&\u0010\nJ \u0010(\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010'\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b(\u0010)J \u0010+\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010*\u001a\u00020\fH\u0086 ¢\u0006\u0004\b+\u0010,J \u0010.\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\fH\u0086 ¢\u0006\u0004\b.\u0010,JH\u00105\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010/\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b5\u0010\u001dJ\u0018\u00106\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b6\u0010\nJ8\u00109\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b9\u0010!J8\u0010:\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u00107\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\b:\u0010!J \u0010<\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010;\u001a\u00020\fH\u0086 ¢\u0006\u0004\b<\u0010,J\u0018\u0010=\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0004H\u0086 ¢\u0006\u0004\b=\u0010\nJ \u0010?\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010>\u001a\u00020\fH\u0086 ¢\u0006\u0004\b?\u0010,J8\u0010B\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0014\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020\u000f2\u0006\u0010A\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\bB\u0010!J0\u0010C\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000fH\u0086 ¢\u0006\u0004\bC\u0010D¨\u0006E"}, d2 = {"Lcom/alightcreative/nanovg/NanoVGWrapper;", "", "<init>", "()V", "", "newInstance", "()J", "handle", "", "freeInstance", "(J)V", "beginPath", "", "windowWidth", "windowHeight", "", "devicePixelRatio", "beginFrame", "(JIIF)V", "x", "y", "moveTo", "(JFF)V", "lineTo", "c1x", "c1y", "c2x", "c2y", "bezierTo", "(JFFFFFF)V", "cx", "cy", "quadTo", "(JFFFF)V", "stroke", "fill", "endFrame", "save", "restore", "width", "strokeWidth", "(JF)V", "cap", "lineCap", "(JI)V", "join", "lineJoin", CmcdData.OBJECT_TYPE_AUDIO_ONLY, "b", "c", "d", "e", InneractiveMediationDefs.GENDER_FEMALE, "transform", "resetTransform", "r", "g", "strokeColor", "fillColor", "op", "globalCompositeOperation", "closePath", "dir", "pathWinding", "w", CmcdData.STREAMING_FORMAT_HLS, "rect", TtmlNode.TEXT_EMPHASIS_MARK_CIRCLE, "(JFFF)V", "nanovg_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class NanoVGWrapper {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final NanoVGWrapper f46889n = new NanoVGWrapper();

    public final native void beginFrame(long handle, int windowWidth, int windowHeight, float devicePixelRatio);

    public final native void beginPath(long handle);

    public final native void bezierTo(long handle, float c1x, float c1y, float c2x, float c2y, float x2, float y2);

    public final native void circle(long handle, float cx, float cy, float r2);

    public final native void closePath(long handle);

    public final native void endFrame(long handle);

    public final native void fill(long handle);

    public final native void fillColor(long handle, float r2, float g2, float b2, float a2);

    public final native void freeInstance(long handle);

    public final native void globalCompositeOperation(long handle, int op);

    public final native void lineCap(long handle, int cap);

    public final native void lineJoin(long handle, int join);

    public final native void lineTo(long handle, float x2, float y2);

    public final native void moveTo(long handle, float x2, float y2);

    public final native long newInstance();

    public final native void pathWinding(long handle, int dir);

    public final native void quadTo(long handle, float cx, float cy, float x2, float y2);

    public final native void rect(long handle, float x2, float y2, float w2, float h2);

    public final native void resetTransform(long handle);

    public final native void restore(long handle);

    public final native void save(long handle);

    public final native void stroke(long handle);

    public final native void strokeColor(long handle, float r2, float g2, float b2, float a2);

    public final native void strokeWidth(long handle, float width);

    public final native void transform(long handle, float a2, float b2, float c2, float d2, float e2, float f3);

    private NanoVGWrapper() {
    }
}
