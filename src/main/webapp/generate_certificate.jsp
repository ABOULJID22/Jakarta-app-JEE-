<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Generer un Certificat</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet">
</head>
<body class="bg-light">
    <div class="container d-flex justify-content-center align-items-center vh-100">
        <div class="card p-4 shadow-lg" style="width: 400px;">
            <h2 class="text-center mb-4">Generer un Certificat</h2>
            <form action="GenerateCertificateServlet" method="POST">
                <div class="mb-3">
                    <label for="nom" class="form-label">Nom :</label>
                    <input type="text" name="nom" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="prenom" class="form-label">Prenom :</label>
                    <input type="text" name="prenom" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="annee" class="form-label">Annee :</label>
                    <input type="number" name="annee" class="form-control" required>
                </div>
                <div class="mb-3">
                    <label for="theme" class="form-label">Theme du Certificat :</label>
                    <input type="text" name="theme" class="form-control" required>
                </div>
                <button type="submit" class="btn btn-primary w-100">Generer</button>
            </form>
        </div>
    </div>
</body>
</html>
