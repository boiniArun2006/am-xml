package com.bendingspoons.oracle.models;

import EJn.I28;
import EJn.Wre;
import EJn.qz;
import XA.Ml;
import androidx.core.database.sqlite.cL.PtsLKY;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class j implements Ml {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final j f51439n = new j();
    private static final Wre rl = qz.t(PtsLKY.TbBZQoCfHYnh, I28.Dsr.f2270n);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f51440t = 8;

    @Override // XA.Ml, XA.eO, XA.w6
    public Wre getDescriptor() {
        return rl;
    }

    @Override // XA.w6
    /* JADX INFO: renamed from: rl, reason: merged with bridge method [inline-methods] */
    public IdentityToken deserialize(gi.I28 decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        try {
            return IdentityToken.INSTANCE.rl(decoder.g());
        } catch (Exception e2) {
            throw new SerializationException("Failed to decode IdentityToken: " + e2.getMessage());
        }
    }

    @Override // XA.eO
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public void serialize(gi.Wre encoder, IdentityToken value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        encoder.T(value.getToken());
    }

    private j() {
    }
}
