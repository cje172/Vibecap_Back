package com.example.vibecap_back.domain.album.dto;

import com.example.vibecap_back.domain.album.domain.Album;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@AllArgsConstructor
public class GetAlbumResponse {
    @JsonProperty("nickname")
    private String nickname;
    @JsonProperty("email")
    private String email;
    @JsonProperty("google_email")
    private String gmail;
    @JsonProperty("vibes")
    private List<Album> vibes;

    /* nickname : String
     * email : String
     * google_email : String
     * vibes : List
     *  - vibe_id : int
     *  - member_id : int
     */

}
