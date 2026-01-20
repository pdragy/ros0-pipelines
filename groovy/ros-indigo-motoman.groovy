node {
    git url: 'https://github.com/ros-industrial/motoman.git', branch: 'indigo-devel'
    registerROS('ros:indigo-desktop-full', [
        'ros-indigo-industrial-robot-client'
    ], [])
}
