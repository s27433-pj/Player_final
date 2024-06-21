/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.3.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package org.openapitools.api;

import org.openapitools.model.PlayerDto;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-06-21T19:09:29.527019+02:00[Europe/Warsaw]")
@Validated
@Tag(name = "api", description = "the api API")
public interface ApiApi {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * DELETE /api/player/{id} : Delete player by ID
     *
     * @param id  (required)
     * @return Player deleted (status code 200)
     *         or Player not found (status code 404)
     */
    @Operation(
        operationId = "apiPlayerIdDelete",
        summary = "Delete player by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "Player deleted"),
            @ApiResponse(responseCode = "404", description = "Player not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/api/player/{id}"
    )
    default ResponseEntity<Void> apiPlayerIdDelete(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/player/{id} : Get player by ID
     *
     * @param id  (required)
     * @return A player (status code 200)
     *         or Player not found (status code 404)
     */
    @Operation(
        operationId = "apiPlayerIdGet",
        summary = "Get player by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "A player", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PlayerDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Player not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/player/{id}",
        produces = { "application/json" }
    )
    default ResponseEntity<PlayerDto> apiPlayerIdGet(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * PUT /api/player/{id} : Update player by ID
     *
     * @param id  (required)
     * @param playerDto  (optional)
     * @return Updated player (status code 200)
     *         or Player not found (status code 404)
     */
    @Operation(
        operationId = "apiPlayerIdPut",
        summary = "Update player by ID",
        responses = {
            @ApiResponse(responseCode = "200", description = "Updated player", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PlayerDto.class))
            }),
            @ApiResponse(responseCode = "404", description = "Player not found")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/api/player/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PlayerDto> apiPlayerIdPut(
        @Parameter(name = "id", description = "", required = true, in = ParameterIn.PATH) @PathVariable("id") Integer id,
        @Parameter(name = "PlayerDto", description = "") @Valid @RequestBody(required = false) PlayerDto playerDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * POST /api/player : Create a new player
     *
     * @param playerDto  (optional)
     * @return Created player (status code 201)
     */
    @Operation(
        operationId = "apiPlayerPost",
        summary = "Create a new player",
        responses = {
            @ApiResponse(responseCode = "201", description = "Created player", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = PlayerDto.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/api/player",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    default ResponseEntity<PlayerDto> apiPlayerPost(
        @Parameter(name = "PlayerDto", description = "") @Valid @RequestBody(required = false) PlayerDto playerDto
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "{ \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 }";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }


    /**
     * GET /api/players : Get all players
     *
     * @return A list of players (status code 200)
     */
    @Operation(
        operationId = "apiPlayersGet",
        summary = "Get all players",
        responses = {
            @ApiResponse(responseCode = "200", description = "A list of players", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = PlayerDto.class)))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/api/players",
        produces = { "application/json" }
    )
    default ResponseEntity<List<PlayerDto>> apiPlayersGet(
        
    ) {
        getRequest().ifPresent(request -> {
            for (MediaType mediaType: MediaType.parseMediaTypes(request.getHeader("Accept"))) {
                if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                    String exampleString = "[ { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 }, { \"firstName\" : \"firstName\", \"lastName\" : \"lastName\", \"id\" : 0 } ]";
                    ApiUtil.setExampleResponse(request, "application/json", exampleString);
                    break;
                }
            }
        });
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);

    }

}