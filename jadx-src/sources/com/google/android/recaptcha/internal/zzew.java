package com.google.android.recaptcha.internal;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.UnknownServiceException;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: /content/repo2/apk-analysis/Alight motion /classes8.dex */
public final class zzew {
    private final HttpURLConnection zza;

    public zzew(HttpURLConnection httpURLConnection) {
        this.zza = httpURLConnection;
    }

    public final HttpURLConnection zzb() {
        return this.zza;
    }

    private final InputStream zzf() throws zzbd {
        try {
            return this.zza.getInputStream();
        } catch (UnknownServiceException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e2.getMessage());
        } catch (IOException e3) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e3.getMessage());
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e4.getMessage());
        }
    }

    private final OutputStream zzg() throws zzbd {
        try {
            return this.zza.getOutputStream();
        } catch (UnknownServiceException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzaf, e2.getMessage());
        } catch (IOException e3) {
            throw new zzbd(zzbb.zzc, zzba.zzae, e3.getMessage());
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzc, zzba.zzak, e4.getMessage());
        }
    }

    public final zzoi zza(zzoi zzoiVar) throws zzbd {
        try {
            int responseCode = this.zza.getResponseCode();
            if (responseCode != 200) {
                if (responseCode == 400) {
                    throw new zzbd(zzbb.zzc, zzba.zzau, null);
                }
                if (responseCode != 503 && responseCode != 403) {
                    if (responseCode != 404) {
                        throw new zzbd(zzbb.zzc, zzba.zzK, null);
                    }
                    throw new zzbd(zzbb.zzc, zzba.zzi, null);
                }
                throw new zzbd(zzbb.zzi, zzba.zzJ, null);
            }
            byte[] bytes = ByteStreamsKt.readBytes(zzf());
            if (bytes.length == 0) {
                throw new zzbd(zzbb.zzc, zzba.zzat, null);
            }
            try {
                Object objZzb = zzoiVar.zzD().zzb(bytes);
                Intrinsics.checkNotNull(objZzb, "null cannot be cast to non-null type T of com.google.android.libraries.abuse.recaptcha.network.CaptchaFeConnection.getResponse");
                return (zzoi) objZzb;
            } catch (Exception e2) {
                throw new zzbd(zzbb.zzc, zzba.zzG, e2.getMessage());
            }
        } catch (Exception e3) {
            throw new zzbd(zzbb.zzc, zzba.zzah, e3.getMessage());
        }
    }

    public final void zzc() throws zzbd {
        try {
            this.zza.connect();
        } catch (SocketTimeoutException e2) {
            throw new zzbd(zzbb.zzc, zzba.zzac, e2.getMessage());
        } catch (IOException e3) {
            throw new zzbd(zzbb.zzc, zzba.zzad, e3.getMessage());
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzc, zzba.zzaj, e4.getMessage());
        }
    }

    public final void zzd() {
        this.zza.disconnect();
    }

    public final void zze(byte[] bArr) throws zzbd {
        try {
            zzg().write(bArr);
        } catch (zzbd e2) {
            throw e2;
        } catch (IOException e3) {
            throw new zzbd(zzbb.zzc, zzba.zzag, e3.getMessage());
        } catch (Exception e4) {
            throw new zzbd(zzbb.zzc, zzba.zzal, e4.getMessage());
        }
    }
}
