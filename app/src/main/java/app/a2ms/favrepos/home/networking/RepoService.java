package app.a2ms.favrepos.home.networking;

import java.util.List;

import app.a2ms.favrepos.home.model.Repo;
import retrofit2.Call;
import retrofit2.http.GET;

public interface RepoService {

    @GET("orgs/Google/repos")
    Call<List<Repo>> getRepositories();
}
