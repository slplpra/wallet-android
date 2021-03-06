package com.learningmachine.android.app.data.webservice;

import com.learningmachine.android.app.data.model.IssuingEstimate;
import com.learningmachine.android.app.data.webservice.request.IssuerAnalytic;
import com.learningmachine.android.app.data.webservice.request.IssuerIntroductionRequest;
import com.learningmachine.android.app.data.webservice.response.IssuerResponse;

import java.util.List;

import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;
import retrofit2.http.Url;
import rx.Observable;

public interface IssuerService {
    @GET
    Observable<IssuerResponse> getIssuer(@Url String url);

    @POST
    Observable<Void> postIntroduction(@Url String url, @Body IssuerIntroductionRequest request);

    @POST
    Observable<Void> postIssuerAnalytics(@Url String url, @Body IssuerAnalytic issuerAnalytic);

    @GET
    Observable<List<IssuingEstimate>> getIssuingEstimates(@Url String url, @Query("key") String key);
}
