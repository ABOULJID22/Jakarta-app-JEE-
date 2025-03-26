<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Accueil</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
        <style>
            body {
                background: url("./assets/image/hero.jpg")  no-repeat center center/cover;
                height: 100vh;
            }
            .overlay {
                background-color: rgba(0, 0, 0, 0.6);
                height: 100vh;
                display: flex;
                justify-content: center;
                align-items: center;
                text-align: center;
                color: white;
            }
        </style>
    </head>
<body>
    <jsp:include page="/header.jsp" />
    <section id="features" class="features_area pt-120">
        
            <div class="overlay">
                <div>
                    <h1 class="display-4">Bienvenue sur notre plateforme</h1>
                    <p class="lead"> Generez facilement vos certificats scolaires en quelques clics.</p>
                    <a href="generate_certificate.jsp" class="btn btn-primary btn-lg">Generer un Certificat</a>
                </div>
            </div>
        
        
    </section>

</body>
</html>
