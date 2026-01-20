node {
    git url: 'https://github.com/ros-industrial/staubli.git', branch: 'melodic-devel'
    registerROS('ros:kinetic-desktop-full', [
        'libopenblas-dev',
        'ros-kinetic-industrial-robot-client',
        'ros-kinetic-moveit-core'
    ], [])
}
