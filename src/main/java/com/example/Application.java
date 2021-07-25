package com.example;

import com.google.api.ads.common.lib.auth.OfflineCredentials;
import com.google.api.ads.common.lib.auth.OfflineCredentials.Api;
import com.google.api.ads.admanager.axis.factory.AdManagerServices;
import com.google.api.ads.admanager.axis.v202102.Network;
import com.google.api.ads.admanager.axis.v202102.NetworkServiceInterface;
import com.google.api.ads.admanager.lib.client.AdManagerSession;
import com.google.api.client.auth.oauth2.Credential;
import io.micronaut.runtime.Micronaut;

public class Application {

  public static void main(String[] args) throws Exception {
//        Micronaut.run(Application.class, args);

    Credential oAuth2Credential = new OfflineCredentials.Builder()
      .forApi(Api.AD_MANAGER)
      .fromFile()
      .build()
      .generateCredential();

    // Construct an AdManagerSession.
    AdManagerSession session = new AdManagerSession.Builder()
      .fromFile()
      .withOAuth2Credential(oAuth2Credential)
      .build();

    // Construct a Google Ad Manager service factory, which can only be used once per
    // thread, but should be reused as much as possible.
    AdManagerServices adManagerServices = new AdManagerServices();

    // Retrieve the appropriate service
    NetworkServiceInterface networkService = adManagerServices.get(session,
      NetworkServiceInterface.class);

    // Make a request
    Network network = networkService.getCurrentNetwork();

    System.out.printf("Current network has network code '%s' and display" +
      " name '%s'.%n", network.getNetworkCode(), network.getDisplayName());
  }
}
